var JSCOV = (function() {

	var currentRunResult = {fileResults : []};
	var storedRunResult = [];

	function clone(obj) {
		// Handle the 3 simple types, and null or undefined
		if (null == obj || "object" != typeof obj)
			return obj;

		// Handle Date
		if (obj instanceof Date) {
			var copy = new Date();
			copy.setTime(obj.getTime());
			return copy;
		}

		// Handle Array
		if (obj instanceof Array) {
			var copy = [];
			var len = obj.length;
			for ( var i = 0; i < len; ++i) {
				copy[i] = clone(obj[i]);
			}
			return copy;
		}

		// Handle Object
		if (obj instanceof Object) {
			var copy = {};
			for ( var attr in obj) {
				if (obj.hasOwnProperty(attr))
					copy[attr] = clone(obj[attr]);
			}
			return copy;
		}

		throw new Error("Unable to copy obj! Its type isn't supported.");
	}

	jscov = {
		initNoop : function(filename, executableLines) {
			var fileResult = {
					filename : filename,
					lineCovered : {}
			};
			var length = executableLines.length;
			for ( var i = 0; i < length; i++) {
				fileResult.lineCovered[executableLines[i]] = 0;
			}

			currentRunResult.fileResults.push(fileResult);
			return fileResult.lineCovered;
		},

		storeCurrentRunResult : function(name) {
			var runResult = clone(currentRunResult);
			runResult.name = name;
			storedRunResult.push(runResult);
		},

		resetCurrentRunResult : function() {
			for (var i = 0; i < currentRunResult.fileResults.length; i++) {
				var fileResult = currentRunResult.fileResults[i];
				for (var line in fileResult.lineCovered) {
					if (fileResult.lineCovered.hasOwnProperty(line)) {
						fileResult.lineCovered[line] = 0;
					}
				}				
			}
		},

		getCurrentRunResult : function() {
			return currentRunResult;
		},

		getStoredRunResult : function() {
			return storedRunResult;
		}

	};

	return jscov;
})();

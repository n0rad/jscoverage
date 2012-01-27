var JSCOV = (function() {
	
	jscov = {
			results : {},
			
			initNoop : function(name, executableLines) {
				var sourceCovered = {
						name : name,
						cover : {}
					};
				this.results[name] = sourceCovered;
				
				var length = executableLines.length;
			    for (var i = 0; i < length; i++) {
			    	sourceCovered.cover[executableLines[i]] = 0;
			    }
				
				return sourceCovered.cover;
			}
			
	};
	
	return jscov; 
})();

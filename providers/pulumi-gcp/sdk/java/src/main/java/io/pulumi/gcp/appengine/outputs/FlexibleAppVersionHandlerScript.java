// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FlexibleAppVersionHandlerScript {
    /**
     * Path to the script from the application root directory.
     * 
     */
    private final String scriptPath;

    @CustomType.Constructor
    private FlexibleAppVersionHandlerScript(@CustomType.Parameter("scriptPath") String scriptPath) {
        this.scriptPath = scriptPath;
    }

    /**
     * Path to the script from the application root directory.
     * 
    */
    public String scriptPath() {
        return this.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionHandlerScript defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionHandlerScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder scriptPath(String scriptPath) {
            this.scriptPath = Objects.requireNonNull(scriptPath);
            return this;
        }        public FlexibleAppVersionHandlerScript build() {
            return new FlexibleAppVersionHandlerScript(scriptPath);
        }
    }
}

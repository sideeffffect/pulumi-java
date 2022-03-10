// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SourceInfoResponse {
    /**
     * All files used during config generation.
     * 
     */
    private final List<Map<String,String>> sourceFiles;

    @OutputCustomType.Constructor
    private SourceInfoResponse(@OutputCustomType.Parameter("sourceFiles") List<Map<String,String>> sourceFiles) {
        this.sourceFiles = sourceFiles;
    }

    /**
     * All files used during config generation.
     * 
    */
    public List<Map<String,String>> getSourceFiles() {
        return this.sourceFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Map<String,String>> sourceFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceFiles = defaults.sourceFiles;
        }

        public Builder sourceFiles(List<Map<String,String>> sourceFiles) {
            this.sourceFiles = Objects.requireNonNull(sourceFiles);
            return this;
        }
        public SourceInfoResponse build() {
            return new SourceInfoResponse(sourceFiles);
        }
    }
}

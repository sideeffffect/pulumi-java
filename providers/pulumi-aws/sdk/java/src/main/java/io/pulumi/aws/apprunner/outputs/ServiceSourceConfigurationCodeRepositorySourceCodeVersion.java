// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceSourceConfigurationCodeRepositorySourceCodeVersion {
    /**
     * The type of version identifier. For a git-based repository, branches represent versions. Valid values: `BRANCH`.
     * 
     */
    private final String type;
    /**
     * A source code version. For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to the branch.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private ServiceSourceConfigurationCodeRepositorySourceCodeVersion(
        String type,
        String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * The type of version identifier. For a git-based repository, branches represent versions. Valid values: `BRANCH`.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A source code version. For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to the branch.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositorySourceCodeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositorySourceCodeVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ServiceSourceConfigurationCodeRepositorySourceCodeVersion build() {
            return new ServiceSourceConfigurationCodeRepositorySourceCodeVersion(type, value);
        }
    }
}

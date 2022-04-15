// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs Empty = new ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs();

    /**
     * The type of version identifier. For a git-based repository, branches represent versions. Valid values: `BRANCH`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * A source code version. For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to the branch.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs(
        Output<String> type,
        Output<String> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs() {
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs build() {
            return new ServiceSourceConfigurationCodeRepositorySourceCodeVersionArgs(type, value);
        }
    }
}

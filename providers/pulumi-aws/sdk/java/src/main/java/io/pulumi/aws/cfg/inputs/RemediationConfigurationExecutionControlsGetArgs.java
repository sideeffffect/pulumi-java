// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.RemediationConfigurationExecutionControlsSsmControlsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationConfigurationExecutionControlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationConfigurationExecutionControlsGetArgs Empty = new RemediationConfigurationExecutionControlsGetArgs();

    /**
     * Configuration block for SSM controls. See below.
     * 
     */
    @Import(name="ssmControls")
      private final @Nullable Output<RemediationConfigurationExecutionControlsSsmControlsGetArgs> ssmControls;

    public Output<RemediationConfigurationExecutionControlsSsmControlsGetArgs> ssmControls() {
        return this.ssmControls == null ? Codegen.empty() : this.ssmControls;
    }

    public RemediationConfigurationExecutionControlsGetArgs(@Nullable Output<RemediationConfigurationExecutionControlsSsmControlsGetArgs> ssmControls) {
        this.ssmControls = ssmControls;
    }

    private RemediationConfigurationExecutionControlsGetArgs() {
        this.ssmControls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationExecutionControlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RemediationConfigurationExecutionControlsSsmControlsGetArgs> ssmControls;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationConfigurationExecutionControlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssmControls = defaults.ssmControls;
        }

        public Builder ssmControls(@Nullable Output<RemediationConfigurationExecutionControlsSsmControlsGetArgs> ssmControls) {
            this.ssmControls = ssmControls;
            return this;
        }
        public Builder ssmControls(@Nullable RemediationConfigurationExecutionControlsSsmControlsGetArgs ssmControls) {
            this.ssmControls = Codegen.ofNullable(ssmControls);
            return this;
        }        public RemediationConfigurationExecutionControlsGetArgs build() {
            return new RemediationConfigurationExecutionControlsGetArgs(ssmControls);
        }
    }
}

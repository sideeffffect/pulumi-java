// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run ExecAction describes a "run in container" action.
 * 
 */
public final class ExecActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecActionArgs Empty = new ExecActionArgs();

    /**
     * (Optional) Command is the command line to execute inside the container, the working directory for the command is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @InputImport(name="command")
      private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    public ExecActionArgs(@Nullable Input<List<String>> command) {
        this.command = command;
    }

    private ExecActionArgs() {
        this.command = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder command(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }
        public ExecActionArgs build() {
            return new ExecActionArgs(command);
        }
    }
}

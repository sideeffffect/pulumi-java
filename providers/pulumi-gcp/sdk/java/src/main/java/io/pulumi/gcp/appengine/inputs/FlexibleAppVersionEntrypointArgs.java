// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlexibleAppVersionEntrypointArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionEntrypointArgs Empty = new FlexibleAppVersionEntrypointArgs();

    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
     */
    @InputImport(name="shell", required=true)
      private final Input<String> shell;

    public Input<String> getShell() {
        return this.shell;
    }

    public FlexibleAppVersionEntrypointArgs(Input<String> shell) {
        this.shell = Objects.requireNonNull(shell, "expected parameter 'shell' to be non-null");
    }

    private FlexibleAppVersionEntrypointArgs() {
        this.shell = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionEntrypointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> shell;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionEntrypointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shell = defaults.shell;
        }

        public Builder shell(Input<String> shell) {
            this.shell = Objects.requireNonNull(shell);
            return this;
        }

        public Builder shell(String shell) {
            this.shell = Input.of(Objects.requireNonNull(shell));
            return this;
        }
        public FlexibleAppVersionEntrypointArgs build() {
            return new FlexibleAppVersionEntrypointArgs(shell);
        }
    }
}

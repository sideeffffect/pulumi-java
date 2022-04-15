// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.deploymentmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetConfigArgs;
import io.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetImportArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentTargetArgs Empty = new DeploymentTargetArgs();

    /**
     * The root configuration file to use for this deployment.
     * Structure is documented below.
     * 
     */
    @Import(name="config", required=true)
      private final Output<DeploymentTargetConfigArgs> config;

    public Output<DeploymentTargetConfigArgs> config() {
        return this.config;
    }

    /**
     * Specifies import files for this configuration. This can be
     * used to import templates or other files. For example, you might
     * import a text file in order to use the file in a template.
     * Structure is documented below.
     * 
     */
    @Import(name="imports")
      private final @Nullable Output<List<DeploymentTargetImportArgs>> imports;

    public Output<List<DeploymentTargetImportArgs>> imports() {
        return this.imports == null ? Codegen.empty() : this.imports;
    }

    public DeploymentTargetArgs(
        Output<DeploymentTargetConfigArgs> config,
        @Nullable Output<List<DeploymentTargetImportArgs>> imports) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.imports = imports;
    }

    private DeploymentTargetArgs() {
        this.config = Codegen.empty();
        this.imports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DeploymentTargetConfigArgs> config;
        private @Nullable Output<List<DeploymentTargetImportArgs>> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder config(Output<DeploymentTargetConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(DeploymentTargetConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder imports(@Nullable Output<List<DeploymentTargetImportArgs>> imports) {
            this.imports = imports;
            return this;
        }
        public Builder imports(@Nullable List<DeploymentTargetImportArgs> imports) {
            this.imports = Codegen.ofNullable(imports);
            return this;
        }
        public Builder imports(DeploymentTargetImportArgs... imports) {
            return imports(List.of(imports));
        }        public DeploymentTargetArgs build() {
            return new DeploymentTargetArgs(config, imports);
        }
    }
}

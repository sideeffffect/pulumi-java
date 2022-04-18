// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.ByProductsArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.EnvironmentArgs;
import com.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1IntotoArtifactArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This corresponds to an in-toto link.
 * 
 */
public final class LinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkArgs Empty = new LinkArgs();

    /**
     * ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step.
     * 
     */
    @Import(name="byproducts")
      private final @Nullable Output<ByProductsArgs> byproducts;

    public Output<ByProductsArgs> byproducts() {
        return this.byproducts == null ? Codegen.empty() : this.byproducts;
    }

    /**
     * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone", "https://github.com/in-toto/demo-project.git"]
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> command() {
        return this.command == null ? Codegen.empty() : this.command;
    }

    /**
     * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "": "..." } }
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<EnvironmentArgs> environment;

    public Output<EnvironmentArgs> environment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : } } ]
     * 
     */
    @Import(name="materials")
      private final @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials;

    public Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials() {
        return this.materials == null ? Codegen.empty() : this.materials;
    }

    /**
     * Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials.
     * 
     */
    @Import(name="products")
      private final @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products;

    public Output<List<GrafeasV1beta1IntotoArtifactArgs>> products() {
        return this.products == null ? Codegen.empty() : this.products;
    }

    public LinkArgs(
        @Nullable Output<ByProductsArgs> byproducts,
        @Nullable Output<List<String>> command,
        @Nullable Output<EnvironmentArgs> environment,
        @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials,
        @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products) {
        this.byproducts = byproducts;
        this.command = command;
        this.environment = environment;
        this.materials = materials;
        this.products = products;
    }

    private LinkArgs() {
        this.byproducts = Codegen.empty();
        this.command = Codegen.empty();
        this.environment = Codegen.empty();
        this.materials = Codegen.empty();
        this.products = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ByProductsArgs> byproducts;
        private @Nullable Output<List<String>> command;
        private @Nullable Output<EnvironmentArgs> environment;
        private @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials;
        private @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byproducts = defaults.byproducts;
    	      this.command = defaults.command;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
    	      this.products = defaults.products;
        }

        public Builder byproducts(@Nullable Output<ByProductsArgs> byproducts) {
            this.byproducts = byproducts;
            return this;
        }
        public Builder byproducts(@Nullable ByProductsArgs byproducts) {
            this.byproducts = Codegen.ofNullable(byproducts);
            return this;
        }
        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }
        public Builder command(@Nullable List<String> command) {
            this.command = Codegen.ofNullable(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder environment(@Nullable Output<EnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable EnvironmentArgs environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder materials(@Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials) {
            this.materials = materials;
            return this;
        }
        public Builder materials(@Nullable List<GrafeasV1beta1IntotoArtifactArgs> materials) {
            this.materials = Codegen.ofNullable(materials);
            return this;
        }
        public Builder materials(GrafeasV1beta1IntotoArtifactArgs... materials) {
            return materials(List.of(materials));
        }
        public Builder products(@Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products) {
            this.products = products;
            return this;
        }
        public Builder products(@Nullable List<GrafeasV1beta1IntotoArtifactArgs> products) {
            this.products = Codegen.ofNullable(products);
            return this;
        }
        public Builder products(GrafeasV1beta1IntotoArtifactArgs... products) {
            return products(List.of(products));
        }        public LinkArgs build() {
            return new LinkArgs(byproducts, command, environment, materials, products);
        }
    }
}

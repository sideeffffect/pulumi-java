// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Note holding the version of the provider's builder and the signature of the provenance message in the build details occurrence.
 * 
 */
public final class BuildNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildNoteArgs Empty = new BuildNoteArgs();

    /**
     * Immutable. Version of the builder which produced this build.
     * 
     */
    @InputImport(name="builderVersion", required=true)
      private final Input<String> builderVersion;

    public Input<String> getBuilderVersion() {
        return this.builderVersion;
    }

    public BuildNoteArgs(Input<String> builderVersion) {
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
    }

    private BuildNoteArgs() {
        this.builderVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> builderVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
        }

        public Builder builderVersion(Input<String> builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Input.of(Objects.requireNonNull(builderVersion));
            return this;
        }
        public BuildNoteArgs build() {
            return new BuildNoteArgs(builderVersion);
        }
    }
}

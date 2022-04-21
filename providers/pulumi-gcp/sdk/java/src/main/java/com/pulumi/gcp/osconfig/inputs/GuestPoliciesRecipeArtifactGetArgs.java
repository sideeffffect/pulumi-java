// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactGcsGetArgs;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactRemoteGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeArtifactGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeArtifactGetArgs Empty = new GuestPoliciesRecipeArtifactGetArgs();

    /**
     * Defaults to false. When false, recipes are subject to validations based on the artifact type:
     * Remote: A checksum must be specified, and only protocols with transport-layer security are permitted.
     * GCS: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * A Google Cloud Storage artifact.
     * Structure is documented below.
     * 
     */
    @Import(name="gcs")
    private @Nullable Output<GuestPoliciesRecipeArtifactGcsGetArgs> gcs;

    public Optional<Output<GuestPoliciesRecipeArtifactGcsGetArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * A generic remote artifact.
     * Structure is documented below.
     * 
     */
    @Import(name="remote")
    private @Nullable Output<GuestPoliciesRecipeArtifactRemoteGetArgs> remote;

    public Optional<Output<GuestPoliciesRecipeArtifactRemoteGetArgs>> remote() {
        return Optional.ofNullable(this.remote);
    }

    private GuestPoliciesRecipeArtifactGetArgs() {}

    private GuestPoliciesRecipeArtifactGetArgs(GuestPoliciesRecipeArtifactGetArgs $) {
        this.allowInsecure = $.allowInsecure;
        this.gcs = $.gcs;
        this.id = $.id;
        this.remote = $.remote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesRecipeArtifactGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesRecipeArtifactGetArgs $;

        public Builder() {
            $ = new GuestPoliciesRecipeArtifactGetArgs();
        }

        public Builder(GuestPoliciesRecipeArtifactGetArgs defaults) {
            $ = new GuestPoliciesRecipeArtifactGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        public Builder gcs(@Nullable Output<GuestPoliciesRecipeArtifactGcsGetArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(GuestPoliciesRecipeArtifactGcsGetArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder remote(@Nullable Output<GuestPoliciesRecipeArtifactRemoteGetArgs> remote) {
            $.remote = remote;
            return this;
        }

        public Builder remote(GuestPoliciesRecipeArtifactRemoteGetArgs remote) {
            return remote(Output.of(remote));
        }

        public GuestPoliciesRecipeArtifactGetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}

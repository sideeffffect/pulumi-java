// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @Import(name="gcs")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs> gcs;

    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs>> gcs() {
        return Optional.ofNullable(this.gcs);
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @Import(name="localPath")
    private @Nullable Output<String> localPath;

    public Optional<Output<String>> localPath() {
        return Optional.ofNullable(this.localPath);
    }

    /**
     * A generic remote file.
     * 
     */
    @Import(name="remote")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs> remote;

    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs>> remote() {
        return Optional.ofNullable(this.remote);
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs $) {
        this.allowInsecure = $.allowInsecure;
        this.gcs = $.gcs;
        this.localPath = $.localPath;
        this.remote = $.remote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        public Builder gcs(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs> gcs) {
            $.gcs = gcs;
            return this;
        }

        public Builder gcs(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceGcsArgs gcs) {
            return gcs(Output.of(gcs));
        }

        public Builder localPath(@Nullable Output<String> localPath) {
            $.localPath = localPath;
            return this;
        }

        public Builder localPath(String localPath) {
            return localPath(Output.of(localPath));
        }

        public Builder remote(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs> remote) {
            $.remote = remote;
            return this;
        }

        public Builder remote(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemoteArgs remote) {
            return remote(Output.of(remote));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileGcsArgs;
import com.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A remote or local file.
 * 
 */
public final class OSPolicyResourceFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileArgs Empty = new OSPolicyResourceFileArgs();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
      private final @Nullable Output<Boolean> allowInsecure;

    public Output<Boolean> allowInsecure() {
        return this.allowInsecure == null ? Codegen.empty() : this.allowInsecure;
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @Import(name="gcs")
      private final @Nullable Output<OSPolicyResourceFileGcsArgs> gcs;

    public Output<OSPolicyResourceFileGcsArgs> gcs() {
        return this.gcs == null ? Codegen.empty() : this.gcs;
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @Import(name="localPath")
      private final @Nullable Output<String> localPath;

    public Output<String> localPath() {
        return this.localPath == null ? Codegen.empty() : this.localPath;
    }

    /**
     * A generic remote file.
     * 
     */
    @Import(name="remote")
      private final @Nullable Output<OSPolicyResourceFileRemoteArgs> remote;

    public Output<OSPolicyResourceFileRemoteArgs> remote() {
        return this.remote == null ? Codegen.empty() : this.remote;
    }

    public OSPolicyResourceFileArgs(
        @Nullable Output<Boolean> allowInsecure,
        @Nullable Output<OSPolicyResourceFileGcsArgs> gcs,
        @Nullable Output<String> localPath,
        @Nullable Output<OSPolicyResourceFileRemoteArgs> remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    private OSPolicyResourceFileArgs() {
        this.allowInsecure = Codegen.empty();
        this.gcs = Codegen.empty();
        this.localPath = Codegen.empty();
        this.remote = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowInsecure;
        private @Nullable Output<OSPolicyResourceFileGcsArgs> gcs;
        private @Nullable Output<String> localPath;
        private @Nullable Output<OSPolicyResourceFileRemoteArgs> remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }
        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Codegen.ofNullable(allowInsecure);
            return this;
        }
        public Builder gcs(@Nullable Output<OSPolicyResourceFileGcsArgs> gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder gcs(@Nullable OSPolicyResourceFileGcsArgs gcs) {
            this.gcs = Codegen.ofNullable(gcs);
            return this;
        }
        public Builder localPath(@Nullable Output<String> localPath) {
            this.localPath = localPath;
            return this;
        }
        public Builder localPath(@Nullable String localPath) {
            this.localPath = Codegen.ofNullable(localPath);
            return this;
        }
        public Builder remote(@Nullable Output<OSPolicyResourceFileRemoteArgs> remote) {
            this.remote = remote;
            return this;
        }
        public Builder remote(@Nullable OSPolicyResourceFileRemoteArgs remote) {
            this.remote = Codegen.ofNullable(remote);
            return this;
        }        public OSPolicyResourceFileArgs build() {
            return new OSPolicyResourceFileArgs(allowInsecure, gcs, localPath, remote);
        }
    }
}

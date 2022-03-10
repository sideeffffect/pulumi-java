// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class NFSVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NFSVolumeSourceArgs Empty = new NFSVolumeSourceArgs();

    /**
     * Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @InputImport(name="path", required=true)
      private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @InputImport(name="server", required=true)
      private final Input<String> server;

    public Input<String> getServer() {
        return this.server;
    }

    public NFSVolumeSourceArgs(
        Input<String> path,
        @Nullable Input<Boolean> readOnly,
        Input<String> server) {
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.readOnly = readOnly;
        this.server = Objects.requireNonNull(server, "expected parameter 'server' to be non-null");
    }

    private NFSVolumeSourceArgs() {
        this.path = Input.empty();
        this.readOnly = Input.empty();
        this.server = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> path;
        private @Nullable Input<Boolean> readOnly;
        private Input<String> server;

        public Builder() {
    	      // Empty
        }

        public Builder(NFSVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.readOnly = defaults.readOnly;
    	      this.server = defaults.server;
        }

        public Builder path(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder readOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder server(Input<String> server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }

        public Builder server(String server) {
            this.server = Input.of(Objects.requireNonNull(server));
            return this;
        }
        public NFSVolumeSourceArgs build() {
            return new NFSVolumeSourceArgs(path, readOnly, server);
        }
    }
}

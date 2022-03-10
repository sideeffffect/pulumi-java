// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs Empty = new OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs();

    /**
     * - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     * 
     */
    @InputImport(name="clients", required=true)
      private final Input<String> clients;

    public Input<String> getClients() {
        return this.clients;
    }

    /**
     * -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     * 
     */
    @InputImport(name="options", required=true)
      private final Input<List<String>> options;

    public Input<List<String>> getOptions() {
        return this.options;
    }

    public OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs(
        Input<String> clients,
        Input<List<String>> options) {
        this.clients = Objects.requireNonNull(clients, "expected parameter 'clients' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
    }

    private OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs() {
        this.clients = Input.empty();
        this.options = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clients;
        private Input<List<String>> options;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.options = defaults.options;
        }

        public Builder clients(Input<String> clients) {
            this.clients = Objects.requireNonNull(clients);
            return this;
        }

        public Builder clients(String clients) {
            this.clients = Input.of(Objects.requireNonNull(clients));
            return this;
        }

        public Builder options(Input<List<String>> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder options(List<String> options) {
            this.options = Input.of(Objects.requireNonNull(options));
            return this;
        }
        public OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs build() {
            return new OpenZfsFileSystemRootVolumeConfigurationNfsExportsClientConfigurationArgs(clients, options);
        }
    }
}

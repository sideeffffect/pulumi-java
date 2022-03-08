// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OpenZfsVolumeNfsExportsClientConfiguration {
    /**
     * - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     * 
     */
    private final String clients;
    /**
     * -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     * 
     */
    private final List<String> options;

    @OutputCustomType.Constructor({"clients","options"})
    private OpenZfsVolumeNfsExportsClientConfiguration(
        String clients,
        List<String> options) {
        this.clients = clients;
        this.options = options;
    }

    /**
     * - A value that specifies who can mount the file system. You can provide a wildcard character (*), an IP address (0.0.0.0), or a CIDR address (192.0.2.0/24. By default, Amazon FSx uses the wildcard character when specifying the client.
     * 
    */
    public String getClients() {
        return this.clients;
    }
    /**
     * -  The options to use when mounting the file system. Maximum of 20 items. See the [Linix NFS exports man page](https://linux.die.net/man/5/exports) for more information. `crossmount` and `sync` are used by default.
     * 
    */
    public List<String> getOptions() {
        return this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeNfsExportsClientConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clients;
        private List<String> options;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeNfsExportsClientConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
    	      this.options = defaults.options;
        }

        public Builder setClients(String clients) {
            this.clients = Objects.requireNonNull(clients);
            return this;
        }

        public Builder setOptions(List<String> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public OpenZfsVolumeNfsExportsClientConfiguration build() {
            return new OpenZfsVolumeNfsExportsClientConfiguration(clients, options);
        }
    }
}

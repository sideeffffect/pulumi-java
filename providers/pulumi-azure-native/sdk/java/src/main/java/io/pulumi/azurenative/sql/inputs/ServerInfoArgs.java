// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Server info for the server trust group.
 * 
 */
public final class ServerInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerInfoArgs Empty = new ServerInfoArgs();

    /**
     * Server Id.
     * 
     */
    @InputImport(name="serverId", required=true)
      private final Input<String> serverId;

    public Input<String> getServerId() {
        return this.serverId;
    }

    public ServerInfoArgs(Input<String> serverId) {
        this.serverId = Objects.requireNonNull(serverId, "expected parameter 'serverId' to be non-null");
    }

    private ServerInfoArgs() {
        this.serverId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> serverId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverId = defaults.serverId;
        }

        public Builder serverId(Input<String> serverId) {
            this.serverId = Objects.requireNonNull(serverId);
            return this;
        }

        public Builder serverId(String serverId) {
            this.serverId = Input.of(Objects.requireNonNull(serverId));
            return this;
        }
        public ServerInfoArgs build() {
            return new ServerInfoArgs(serverId);
        }
    }
}

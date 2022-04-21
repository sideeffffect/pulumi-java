// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the source of connection monitor.
 * 
 */
public final class ConnectionMonitorSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorSourceArgs Empty = new ConnectionMonitorSourceArgs();

    /**
     * The source port used by connection monitor.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The ID of the resource used as the source by connection monitor.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    private ConnectionMonitorSourceArgs() {}

    private ConnectionMonitorSourceArgs(ConnectionMonitorSourceArgs $) {
        this.port = $.port;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorSourceArgs $;

        public Builder() {
            $ = new ConnectionMonitorSourceArgs();
        }

        public Builder(ConnectionMonitorSourceArgs defaults) {
            $ = new ConnectionMonitorSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public ConnectionMonitorSourceArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}

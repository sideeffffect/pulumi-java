// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionBackendServiceConnectionTrackingPolicyArgs extends ResourceArgs {

    public static final RegionBackendServiceConnectionTrackingPolicyArgs Empty = new RegionBackendServiceConnectionTrackingPolicyArgs();

    /**
     * Specifies connection persistence when backends are unhealthy.
     * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
     * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
     * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
     * or the Session Affinity is configured for 5-tuple. They do not persist
     * for UDP.
     * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
     * connections on the unhealthy backend are never persisted on the unhealthy
     * backend. They are always diverted to newly selected healthy backends
     * (unless all backends are unhealthy).
     * If set to `ALWAYS_PERSIST`, existing connections always persist on
     * unhealthy backends regardless of protocol and session affinity. It is
     * generally not recommended to use this mode overriding the default.
     * Default value is `DEFAULT_FOR_PROTOCOL`.
     * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
     * 
     */
    @Import(name="connectionPersistenceOnUnhealthyBackends")
    private @Nullable Output<String> connectionPersistenceOnUnhealthyBackends;

    /**
     * @return Specifies connection persistence when backends are unhealthy.
     * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
     * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
     * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
     * or the Session Affinity is configured for 5-tuple. They do not persist
     * for UDP.
     * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
     * connections on the unhealthy backend are never persisted on the unhealthy
     * backend. They are always diverted to newly selected healthy backends
     * (unless all backends are unhealthy).
     * If set to `ALWAYS_PERSIST`, existing connections always persist on
     * unhealthy backends regardless of protocol and session affinity. It is
     * generally not recommended to use this mode overriding the default.
     * Default value is `DEFAULT_FOR_PROTOCOL`.
     * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
     * 
     */
    public Optional<Output<String>> connectionPersistenceOnUnhealthyBackends() {
        return Optional.ofNullable(this.connectionPersistenceOnUnhealthyBackends);
    }

    /**
     * Specifies how long to keep a Connection Tracking entry while there is
     * no matching traffic (in seconds).
     * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
     * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
     * 
     */
    @Import(name="idleTimeoutSec")
    private @Nullable Output<Integer> idleTimeoutSec;

    /**
     * @return Specifies how long to keep a Connection Tracking entry while there is
     * no matching traffic (in seconds).
     * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
     * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutSec() {
        return Optional.ofNullable(this.idleTimeoutSec);
    }

    /**
     * Specifies the key used for connection tracking. There are two options:
     * `PER_CONNECTION`: The Connection Tracking is performed as per the
     * Connection Key (default Hash Method) for the specific protocol.
     * `PER_SESSION`: The Connection Tracking is performed as per the
     * configured Session Affinity. It matches the configured Session Affinity.
     * Default value is `PER_CONNECTION`.
     * Possible values are `PER_CONNECTION` and `PER_SESSION`.
     * 
     */
    @Import(name="trackingMode")
    private @Nullable Output<String> trackingMode;

    /**
     * @return Specifies the key used for connection tracking. There are two options:
     * `PER_CONNECTION`: The Connection Tracking is performed as per the
     * Connection Key (default Hash Method) for the specific protocol.
     * `PER_SESSION`: The Connection Tracking is performed as per the
     * configured Session Affinity. It matches the configured Session Affinity.
     * Default value is `PER_CONNECTION`.
     * Possible values are `PER_CONNECTION` and `PER_SESSION`.
     * 
     */
    public Optional<Output<String>> trackingMode() {
        return Optional.ofNullable(this.trackingMode);
    }

    private RegionBackendServiceConnectionTrackingPolicyArgs() {}

    private RegionBackendServiceConnectionTrackingPolicyArgs(RegionBackendServiceConnectionTrackingPolicyArgs $) {
        this.connectionPersistenceOnUnhealthyBackends = $.connectionPersistenceOnUnhealthyBackends;
        this.idleTimeoutSec = $.idleTimeoutSec;
        this.trackingMode = $.trackingMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionBackendServiceConnectionTrackingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionBackendServiceConnectionTrackingPolicyArgs $;

        public Builder() {
            $ = new RegionBackendServiceConnectionTrackingPolicyArgs();
        }

        public Builder(RegionBackendServiceConnectionTrackingPolicyArgs defaults) {
            $ = new RegionBackendServiceConnectionTrackingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPersistenceOnUnhealthyBackends Specifies connection persistence when backends are unhealthy.
         * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
         * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
         * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
         * or the Session Affinity is configured for 5-tuple. They do not persist
         * for UDP.
         * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
         * connections on the unhealthy backend are never persisted on the unhealthy
         * backend. They are always diverted to newly selected healthy backends
         * (unless all backends are unhealthy).
         * If set to `ALWAYS_PERSIST`, existing connections always persist on
         * unhealthy backends regardless of protocol and session affinity. It is
         * generally not recommended to use this mode overriding the default.
         * Default value is `DEFAULT_FOR_PROTOCOL`.
         * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
         * 
         * @return builder
         * 
         */
        public Builder connectionPersistenceOnUnhealthyBackends(@Nullable Output<String> connectionPersistenceOnUnhealthyBackends) {
            $.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            return this;
        }

        /**
         * @param connectionPersistenceOnUnhealthyBackends Specifies connection persistence when backends are unhealthy.
         * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
         * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
         * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
         * or the Session Affinity is configured for 5-tuple. They do not persist
         * for UDP.
         * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
         * connections on the unhealthy backend are never persisted on the unhealthy
         * backend. They are always diverted to newly selected healthy backends
         * (unless all backends are unhealthy).
         * If set to `ALWAYS_PERSIST`, existing connections always persist on
         * unhealthy backends regardless of protocol and session affinity. It is
         * generally not recommended to use this mode overriding the default.
         * Default value is `DEFAULT_FOR_PROTOCOL`.
         * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
         * 
         * @return builder
         * 
         */
        public Builder connectionPersistenceOnUnhealthyBackends(String connectionPersistenceOnUnhealthyBackends) {
            return connectionPersistenceOnUnhealthyBackends(Output.of(connectionPersistenceOnUnhealthyBackends));
        }

        /**
         * @param idleTimeoutSec Specifies how long to keep a Connection Tracking entry while there is
         * no matching traffic (in seconds).
         * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
         * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutSec(@Nullable Output<Integer> idleTimeoutSec) {
            $.idleTimeoutSec = idleTimeoutSec;
            return this;
        }

        /**
         * @param idleTimeoutSec Specifies how long to keep a Connection Tracking entry while there is
         * no matching traffic (in seconds).
         * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
         * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutSec(Integer idleTimeoutSec) {
            return idleTimeoutSec(Output.of(idleTimeoutSec));
        }

        /**
         * @param trackingMode Specifies the key used for connection tracking. There are two options:
         * `PER_CONNECTION`: The Connection Tracking is performed as per the
         * Connection Key (default Hash Method) for the specific protocol.
         * `PER_SESSION`: The Connection Tracking is performed as per the
         * configured Session Affinity. It matches the configured Session Affinity.
         * Default value is `PER_CONNECTION`.
         * Possible values are `PER_CONNECTION` and `PER_SESSION`.
         * 
         * @return builder
         * 
         */
        public Builder trackingMode(@Nullable Output<String> trackingMode) {
            $.trackingMode = trackingMode;
            return this;
        }

        /**
         * @param trackingMode Specifies the key used for connection tracking. There are two options:
         * `PER_CONNECTION`: The Connection Tracking is performed as per the
         * Connection Key (default Hash Method) for the specific protocol.
         * `PER_SESSION`: The Connection Tracking is performed as per the
         * configured Session Affinity. It matches the configured Session Affinity.
         * Default value is `PER_CONNECTION`.
         * Possible values are `PER_CONNECTION` and `PER_SESSION`.
         * 
         * @return builder
         * 
         */
        public Builder trackingMode(String trackingMode) {
            return trackingMode(Output.of(trackingMode));
        }

        public RegionBackendServiceConnectionTrackingPolicyArgs build() {
            return $;
        }
    }

}

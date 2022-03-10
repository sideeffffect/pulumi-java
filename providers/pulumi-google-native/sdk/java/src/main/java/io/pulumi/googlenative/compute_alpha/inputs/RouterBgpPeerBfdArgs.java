// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RouterBgpPeerBfdMode;
import io.pulumi.googlenative.compute_alpha.enums.RouterBgpPeerBfdPacketMode;
import io.pulumi.googlenative.compute_alpha.enums.RouterBgpPeerBfdSessionInitializationMode;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterBgpPeerBfdArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterBgpPeerBfdArgs Empty = new RouterBgpPeerBfdArgs();

    /**
     * The minimum interval, in milliseconds, between BFD control packets received from the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the transmit interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    @InputImport(name="minReceiveInterval")
      private final @Nullable Input<Integer> minReceiveInterval;

    public Input<Integer> getMinReceiveInterval() {
        return this.minReceiveInterval == null ? Input.empty() : this.minReceiveInterval;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer router. The actual value is negotiated between the two routers and is equal to the greater of this value and the corresponding receive interval of the other router. If set, this value must be between 1000 and 30000. The default is 1000.
     * 
     */
    @InputImport(name="minTransmitInterval")
      private final @Nullable Input<Integer> minTransmitInterval;

    public Input<Integer> getMinTransmitInterval() {
        return this.minTransmitInterval == null ? Input.empty() : this.minTransmitInterval;
    }

    /**
     * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<RouterBgpPeerBfdMode> mode;

    public Input<RouterBgpPeerBfdMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The number of consecutive BFD packets that must be missed before BFD declares that a peer is unavailable. If set, the value must be a value between 5 and 16. The default is 5.
     * 
     */
    @InputImport(name="multiplier")
      private final @Nullable Input<Integer> multiplier;

    public Input<Integer> getMultiplier() {
        return this.multiplier == null ? Input.empty() : this.multiplier;
    }

    /**
     * The BFD packet mode for this BGP peer. If set to CONTROL_AND_ECHO, BFD echo mode is enabled for this BGP peer. In this mode, if the peer router also has BFD echo mode enabled, BFD echo packets will be sent to the other router. If the peer router does not have BFD echo mode enabled, only control packets will be sent. If set to CONTROL_ONLY, BFD echo mode is disabled for this BGP peer. If this router and the peer router have a multihop connection, this should be set to CONTROL_ONLY as BFD echo mode is only supported on singlehop connections. The default is CONTROL_AND_ECHO.
     * 
     */
    @InputImport(name="packetMode")
      private final @Nullable Input<RouterBgpPeerBfdPacketMode> packetMode;

    public Input<RouterBgpPeerBfdPacketMode> getPacketMode() {
        return this.packetMode == null ? Input.empty() : this.packetMode;
    }

    /**
     * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is disabled for this BGP peer. The default is PASSIVE.
     * 
     */
    @InputImport(name="sessionInitializationMode")
      private final @Nullable Input<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode;

    public Input<RouterBgpPeerBfdSessionInitializationMode> getSessionInitializationMode() {
        return this.sessionInitializationMode == null ? Input.empty() : this.sessionInitializationMode;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets transmitted to and received from the peer router when BFD echo mode is enabled on both routers. The actual transmit and receive intervals are negotiated between the two routers and are equal to the greater of this value and the corresponding interval on the other router. If set, this value must be between 1000 and 30000. The default is 5000.
     * 
     */
    @InputImport(name="slowTimerInterval")
      private final @Nullable Input<Integer> slowTimerInterval;

    public Input<Integer> getSlowTimerInterval() {
        return this.slowTimerInterval == null ? Input.empty() : this.slowTimerInterval;
    }

    public RouterBgpPeerBfdArgs(
        @Nullable Input<Integer> minReceiveInterval,
        @Nullable Input<Integer> minTransmitInterval,
        @Nullable Input<RouterBgpPeerBfdMode> mode,
        @Nullable Input<Integer> multiplier,
        @Nullable Input<RouterBgpPeerBfdPacketMode> packetMode,
        @Nullable Input<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode,
        @Nullable Input<Integer> slowTimerInterval) {
        this.minReceiveInterval = minReceiveInterval;
        this.minTransmitInterval = minTransmitInterval;
        this.mode = mode;
        this.multiplier = multiplier;
        this.packetMode = packetMode;
        this.sessionInitializationMode = sessionInitializationMode;
        this.slowTimerInterval = slowTimerInterval;
    }

    private RouterBgpPeerBfdArgs() {
        this.minReceiveInterval = Input.empty();
        this.minTransmitInterval = Input.empty();
        this.mode = Input.empty();
        this.multiplier = Input.empty();
        this.packetMode = Input.empty();
        this.sessionInitializationMode = Input.empty();
        this.slowTimerInterval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerBfdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReceiveInterval;
        private @Nullable Input<Integer> minTransmitInterval;
        private @Nullable Input<RouterBgpPeerBfdMode> mode;
        private @Nullable Input<Integer> multiplier;
        private @Nullable Input<RouterBgpPeerBfdPacketMode> packetMode;
        private @Nullable Input<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode;
        private @Nullable Input<Integer> slowTimerInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerBfdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.mode = defaults.mode;
    	      this.multiplier = defaults.multiplier;
    	      this.packetMode = defaults.packetMode;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
    	      this.slowTimerInterval = defaults.slowTimerInterval;
        }

        public Builder minReceiveInterval(@Nullable Input<Integer> minReceiveInterval) {
            this.minReceiveInterval = minReceiveInterval;
            return this;
        }

        public Builder minReceiveInterval(@Nullable Integer minReceiveInterval) {
            this.minReceiveInterval = Input.ofNullable(minReceiveInterval);
            return this;
        }

        public Builder minTransmitInterval(@Nullable Input<Integer> minTransmitInterval) {
            this.minTransmitInterval = minTransmitInterval;
            return this;
        }

        public Builder minTransmitInterval(@Nullable Integer minTransmitInterval) {
            this.minTransmitInterval = Input.ofNullable(minTransmitInterval);
            return this;
        }

        public Builder mode(@Nullable Input<RouterBgpPeerBfdMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable RouterBgpPeerBfdMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder multiplier(@Nullable Input<Integer> multiplier) {
            this.multiplier = multiplier;
            return this;
        }

        public Builder multiplier(@Nullable Integer multiplier) {
            this.multiplier = Input.ofNullable(multiplier);
            return this;
        }

        public Builder packetMode(@Nullable Input<RouterBgpPeerBfdPacketMode> packetMode) {
            this.packetMode = packetMode;
            return this;
        }

        public Builder packetMode(@Nullable RouterBgpPeerBfdPacketMode packetMode) {
            this.packetMode = Input.ofNullable(packetMode);
            return this;
        }

        public Builder sessionInitializationMode(@Nullable Input<RouterBgpPeerBfdSessionInitializationMode> sessionInitializationMode) {
            this.sessionInitializationMode = sessionInitializationMode;
            return this;
        }

        public Builder sessionInitializationMode(@Nullable RouterBgpPeerBfdSessionInitializationMode sessionInitializationMode) {
            this.sessionInitializationMode = Input.ofNullable(sessionInitializationMode);
            return this;
        }

        public Builder slowTimerInterval(@Nullable Input<Integer> slowTimerInterval) {
            this.slowTimerInterval = slowTimerInterval;
            return this;
        }

        public Builder slowTimerInterval(@Nullable Integer slowTimerInterval) {
            this.slowTimerInterval = Input.ofNullable(slowTimerInterval);
            return this;
        }
        public RouterBgpPeerBfdArgs build() {
            return new RouterBgpPeerBfdArgs(minReceiveInterval, minTransmitInterval, mode, multiplier, packetMode, sessionInitializationMode, slowTimerInterval);
        }
    }
}

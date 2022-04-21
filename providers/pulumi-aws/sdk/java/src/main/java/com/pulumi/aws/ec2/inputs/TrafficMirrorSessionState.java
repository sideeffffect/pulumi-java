// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorSessionState extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorSessionState Empty = new TrafficMirrorSessionState();

    /**
     * The ARN of the traffic mirror session.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A description of the traffic mirror session.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    @Import(name="networkInterfaceId")
    private @Nullable Output<String> networkInterfaceId;

    public Optional<Output<String>> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }

    /**
     * The AWS account ID of the session owner.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    @Import(name="packetLength")
    private @Nullable Output<Integer> packetLength;

    public Optional<Output<Integer>> packetLength() {
        return Optional.ofNullable(this.packetLength);
    }

    /**
     * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    @Import(name="sessionNumber")
    private @Nullable Output<Integer> sessionNumber;

    public Optional<Output<Integer>> sessionNumber() {
        return Optional.ofNullable(this.sessionNumber);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * ID of the traffic mirror filter to be used
     * 
     */
    @Import(name="trafficMirrorFilterId")
    private @Nullable Output<String> trafficMirrorFilterId;

    public Optional<Output<String>> trafficMirrorFilterId() {
        return Optional.ofNullable(this.trafficMirrorFilterId);
    }

    /**
     * ID of the traffic mirror target to be used
     * 
     */
    @Import(name="trafficMirrorTargetId")
    private @Nullable Output<String> trafficMirrorTargetId;

    public Optional<Output<String>> trafficMirrorTargetId() {
        return Optional.ofNullable(this.trafficMirrorTargetId);
    }

    /**
     * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<Integer> virtualNetworkId;

    public Optional<Output<Integer>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    private TrafficMirrorSessionState() {}

    private TrafficMirrorSessionState(TrafficMirrorSessionState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.networkInterfaceId = $.networkInterfaceId;
        this.ownerId = $.ownerId;
        this.packetLength = $.packetLength;
        this.sessionNumber = $.sessionNumber;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.trafficMirrorFilterId = $.trafficMirrorFilterId;
        this.trafficMirrorTargetId = $.trafficMirrorTargetId;
        this.virtualNetworkId = $.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorSessionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorSessionState $;

        public Builder() {
            $ = new TrafficMirrorSessionState();
        }

        public Builder(TrafficMirrorSessionState defaults) {
            $ = new TrafficMirrorSessionState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder packetLength(@Nullable Output<Integer> packetLength) {
            $.packetLength = packetLength;
            return this;
        }

        public Builder packetLength(Integer packetLength) {
            return packetLength(Output.of(packetLength));
        }

        public Builder sessionNumber(@Nullable Output<Integer> sessionNumber) {
            $.sessionNumber = sessionNumber;
            return this;
        }

        public Builder sessionNumber(Integer sessionNumber) {
            return sessionNumber(Output.of(sessionNumber));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder trafficMirrorFilterId(@Nullable Output<String> trafficMirrorFilterId) {
            $.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            return trafficMirrorFilterId(Output.of(trafficMirrorFilterId));
        }

        public Builder trafficMirrorTargetId(@Nullable Output<String> trafficMirrorTargetId) {
            $.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }

        public Builder trafficMirrorTargetId(String trafficMirrorTargetId) {
            return trafficMirrorTargetId(Output.of(trafficMirrorTargetId));
        }

        public Builder virtualNetworkId(@Nullable Output<Integer> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        public Builder virtualNetworkId(Integer virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public TrafficMirrorSessionState build() {
            return $;
        }
    }

}

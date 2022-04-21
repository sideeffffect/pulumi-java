// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.azurenative.orbital.enums.Direction;
import com.pulumi.azurenative.orbital.enums.Polarization;
import com.pulumi.azurenative.orbital.inputs.ContactProfileLinkChannelArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contact Profile link
 * 
 */
public final class ContactProfileLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactProfileLinkArgs Empty = new ContactProfileLinkArgs();

    /**
     * Contact Profile Link Channel
     * 
     */
    @Import(name="channels", required=true)
    private Output<List<ContactProfileLinkChannelArgs>> channels;

    public Output<List<ContactProfileLinkChannelArgs>> channels() {
        return this.channels;
    }

    /**
     * Direction (uplink or downlink)
     * 
     */
    @Import(name="direction", required=true)
    private Output<Either<String,Direction>> direction;

    public Output<Either<String,Direction>> direction() {
        return this.direction;
    }

    /**
     * Effective Isotropic Radiated Power (EIRP) in dBW.
     * 
     */
    @Import(name="eirpdBW")
    private @Nullable Output<Double> eirpdBW;

    public Optional<Output<Double>> eirpdBW() {
        return Optional.ofNullable(this.eirpdBW);
    }

    /**
     * Gain To Noise Temperature in db/K.
     * 
     */
    @Import(name="gainOverTemperature")
    private @Nullable Output<Double> gainOverTemperature;

    public Optional<Output<Double>> gainOverTemperature() {
        return Optional.ofNullable(this.gainOverTemperature);
    }

    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    @Import(name="polarization", required=true)
    private Output<Either<String,Polarization>> polarization;

    public Output<Either<String,Polarization>> polarization() {
        return this.polarization;
    }

    private ContactProfileLinkArgs() {}

    private ContactProfileLinkArgs(ContactProfileLinkArgs $) {
        this.channels = $.channels;
        this.direction = $.direction;
        this.eirpdBW = $.eirpdBW;
        this.gainOverTemperature = $.gainOverTemperature;
        this.polarization = $.polarization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactProfileLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactProfileLinkArgs $;

        public Builder() {
            $ = new ContactProfileLinkArgs();
        }

        public Builder(ContactProfileLinkArgs defaults) {
            $ = new ContactProfileLinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder channels(Output<List<ContactProfileLinkChannelArgs>> channels) {
            $.channels = channels;
            return this;
        }

        public Builder channels(List<ContactProfileLinkChannelArgs> channels) {
            return channels(Output.of(channels));
        }

        public Builder channels(ContactProfileLinkChannelArgs... channels) {
            return channels(List.of(channels));
        }

        public Builder direction(Output<Either<String,Direction>> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(Either<String,Direction> direction) {
            return direction(Output.of(direction));
        }

        public Builder eirpdBW(@Nullable Output<Double> eirpdBW) {
            $.eirpdBW = eirpdBW;
            return this;
        }

        public Builder eirpdBW(Double eirpdBW) {
            return eirpdBW(Output.of(eirpdBW));
        }

        public Builder gainOverTemperature(@Nullable Output<Double> gainOverTemperature) {
            $.gainOverTemperature = gainOverTemperature;
            return this;
        }

        public Builder gainOverTemperature(Double gainOverTemperature) {
            return gainOverTemperature(Output.of(gainOverTemperature));
        }

        public Builder polarization(Output<Either<String,Polarization>> polarization) {
            $.polarization = polarization;
            return this;
        }

        public Builder polarization(Either<String,Polarization> polarization) {
            return polarization(Output.of(polarization));
        }

        public ContactProfileLinkArgs build() {
            $.channels = Objects.requireNonNull($.channels, "expected parameter 'channels' to be non-null");
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.polarization = Objects.requireNonNull($.polarization, "expected parameter 'polarization' to be non-null");
            return $;
        }
    }

}

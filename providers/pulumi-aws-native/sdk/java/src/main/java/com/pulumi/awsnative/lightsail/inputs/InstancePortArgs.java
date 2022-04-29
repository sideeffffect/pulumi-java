// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Port of the Instance.
 * 
 */
public final class InstancePortArgs extends ResourceArgs {

    public static final InstancePortArgs Empty = new InstancePortArgs();

    /**
     * Access Direction for Protocol of the Instance(inbound/outbound).
     * 
     */
    @Import(name="accessDirection")
    private @Nullable Output<String> accessDirection;

    /**
     * @return Access Direction for Protocol of the Instance(inbound/outbound).
     * 
     */
    public Optional<Output<String>> accessDirection() {
        return Optional.ofNullable(this.accessDirection);
    }

    /**
     * Access From Protocol of the Instance.
     * 
     */
    @Import(name="accessFrom")
    private @Nullable Output<String> accessFrom;

    /**
     * @return Access From Protocol of the Instance.
     * 
     */
    public Optional<Output<String>> accessFrom() {
        return Optional.ofNullable(this.accessFrom);
    }

    /**
     * Access Type Protocol of the Instance.
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<String> accessType;

    /**
     * @return Access Type Protocol of the Instance.
     * 
     */
    public Optional<Output<String>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    @Import(name="cidrListAliases")
    private @Nullable Output<List<String>> cidrListAliases;

    public Optional<Output<List<String>>> cidrListAliases() {
        return Optional.ofNullable(this.cidrListAliases);
    }

    @Import(name="cidrs")
    private @Nullable Output<List<String>> cidrs;

    public Optional<Output<List<String>>> cidrs() {
        return Optional.ofNullable(this.cidrs);
    }

    /**
     * CommonName for Protocol of the Instance.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    /**
     * @return CommonName for Protocol of the Instance.
     * 
     */
    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * From Port of the Instance.
     * 
     */
    @Import(name="fromPort")
    private @Nullable Output<Integer> fromPort;

    /**
     * @return From Port of the Instance.
     * 
     */
    public Optional<Output<Integer>> fromPort() {
        return Optional.ofNullable(this.fromPort);
    }

    @Import(name="ipv6Cidrs")
    private @Nullable Output<List<String>> ipv6Cidrs;

    public Optional<Output<List<String>>> ipv6Cidrs() {
        return Optional.ofNullable(this.ipv6Cidrs);
    }

    /**
     * Port Protocol of the Instance.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Port Protocol of the Instance.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * To Port of the Instance.
     * 
     */
    @Import(name="toPort")
    private @Nullable Output<Integer> toPort;

    /**
     * @return To Port of the Instance.
     * 
     */
    public Optional<Output<Integer>> toPort() {
        return Optional.ofNullable(this.toPort);
    }

    private InstancePortArgs() {}

    private InstancePortArgs(InstancePortArgs $) {
        this.accessDirection = $.accessDirection;
        this.accessFrom = $.accessFrom;
        this.accessType = $.accessType;
        this.cidrListAliases = $.cidrListAliases;
        this.cidrs = $.cidrs;
        this.commonName = $.commonName;
        this.fromPort = $.fromPort;
        this.ipv6Cidrs = $.ipv6Cidrs;
        this.protocol = $.protocol;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePortArgs $;

        public Builder() {
            $ = new InstancePortArgs();
        }

        public Builder(InstancePortArgs defaults) {
            $ = new InstancePortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessDirection Access Direction for Protocol of the Instance(inbound/outbound).
         * 
         * @return builder
         * 
         */
        public Builder accessDirection(@Nullable Output<String> accessDirection) {
            $.accessDirection = accessDirection;
            return this;
        }

        /**
         * @param accessDirection Access Direction for Protocol of the Instance(inbound/outbound).
         * 
         * @return builder
         * 
         */
        public Builder accessDirection(String accessDirection) {
            return accessDirection(Output.of(accessDirection));
        }

        /**
         * @param accessFrom Access From Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder accessFrom(@Nullable Output<String> accessFrom) {
            $.accessFrom = accessFrom;
            return this;
        }

        /**
         * @param accessFrom Access From Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder accessFrom(String accessFrom) {
            return accessFrom(Output.of(accessFrom));
        }

        /**
         * @param accessType Access Type Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder accessType(@Nullable Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType Access Type Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        public Builder cidrListAliases(@Nullable Output<List<String>> cidrListAliases) {
            $.cidrListAliases = cidrListAliases;
            return this;
        }

        public Builder cidrListAliases(List<String> cidrListAliases) {
            return cidrListAliases(Output.of(cidrListAliases));
        }

        public Builder cidrListAliases(String... cidrListAliases) {
            return cidrListAliases(List.of(cidrListAliases));
        }

        public Builder cidrs(@Nullable Output<List<String>> cidrs) {
            $.cidrs = cidrs;
            return this;
        }

        public Builder cidrs(List<String> cidrs) {
            return cidrs(Output.of(cidrs));
        }

        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }

        /**
         * @param commonName CommonName for Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName CommonName for Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param fromPort From Port of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(@Nullable Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        /**
         * @param fromPort From Port of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        public Builder ipv6Cidrs(@Nullable Output<List<String>> ipv6Cidrs) {
            $.ipv6Cidrs = ipv6Cidrs;
            return this;
        }

        public Builder ipv6Cidrs(List<String> ipv6Cidrs) {
            return ipv6Cidrs(Output.of(ipv6Cidrs));
        }

        public Builder ipv6Cidrs(String... ipv6Cidrs) {
            return ipv6Cidrs(List.of(ipv6Cidrs));
        }

        /**
         * @param protocol Port Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Port Protocol of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param toPort To Port of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder toPort(@Nullable Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        /**
         * @param toPort To Port of the Instance.
         * 
         * @return builder
         * 
         */
        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public InstancePortArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.DHCPOptionsTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DHCPOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DHCPOptionsArgs Empty = new DHCPOptionsArgs();

    /**
     * This value is used to complete unqualified DNS hostnames.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The IPv4 addresses of up to four domain name servers, or AmazonProvidedDNS.
     * 
     */
    @InputImport(name="domainNameServers")
      private final @Nullable Input<List<String>> domainNameServers;

    public Input<List<String>> getDomainNameServers() {
        return this.domainNameServers == null ? Input.empty() : this.domainNameServers;
    }

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     * 
     */
    @InputImport(name="netbiosNameServers")
      private final @Nullable Input<List<String>> netbiosNameServers;

    public Input<List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers == null ? Input.empty() : this.netbiosNameServers;
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8).
     * 
     */
    @InputImport(name="netbiosNodeType")
      private final @Nullable Input<Integer> netbiosNodeType;

    public Input<Integer> getNetbiosNodeType() {
        return this.netbiosNodeType == null ? Input.empty() : this.netbiosNodeType;
    }

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     * 
     */
    @InputImport(name="ntpServers")
      private final @Nullable Input<List<String>> ntpServers;

    public Input<List<String>> getNtpServers() {
        return this.ntpServers == null ? Input.empty() : this.ntpServers;
    }

    /**
     * Any tags assigned to the DHCP options set.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<DHCPOptionsTagArgs>> tags;

    public Input<List<DHCPOptionsTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DHCPOptionsArgs(
        @Nullable Input<String> domainName,
        @Nullable Input<List<String>> domainNameServers,
        @Nullable Input<List<String>> netbiosNameServers,
        @Nullable Input<Integer> netbiosNodeType,
        @Nullable Input<List<String>> ntpServers,
        @Nullable Input<List<DHCPOptionsTagArgs>> tags) {
        this.domainName = domainName;
        this.domainNameServers = domainNameServers;
        this.netbiosNameServers = netbiosNameServers;
        this.netbiosNodeType = netbiosNodeType;
        this.ntpServers = ntpServers;
        this.tags = tags;
    }

    private DHCPOptionsArgs() {
        this.domainName = Input.empty();
        this.domainNameServers = Input.empty();
        this.netbiosNameServers = Input.empty();
        this.netbiosNodeType = Input.empty();
        this.ntpServers = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DHCPOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private @Nullable Input<List<String>> domainNameServers;
        private @Nullable Input<List<String>> netbiosNameServers;
        private @Nullable Input<Integer> netbiosNodeType;
        private @Nullable Input<List<String>> ntpServers;
        private @Nullable Input<List<DHCPOptionsTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DHCPOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainNameServers = defaults.domainNameServers;
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ntpServers = defaults.ntpServers;
    	      this.tags = defaults.tags;
        }

        public Builder domainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder domainNameServers(@Nullable Input<List<String>> domainNameServers) {
            this.domainNameServers = domainNameServers;
            return this;
        }

        public Builder domainNameServers(@Nullable List<String> domainNameServers) {
            this.domainNameServers = Input.ofNullable(domainNameServers);
            return this;
        }

        public Builder netbiosNameServers(@Nullable Input<List<String>> netbiosNameServers) {
            this.netbiosNameServers = netbiosNameServers;
            return this;
        }

        public Builder netbiosNameServers(@Nullable List<String> netbiosNameServers) {
            this.netbiosNameServers = Input.ofNullable(netbiosNameServers);
            return this;
        }

        public Builder netbiosNodeType(@Nullable Input<Integer> netbiosNodeType) {
            this.netbiosNodeType = netbiosNodeType;
            return this;
        }

        public Builder netbiosNodeType(@Nullable Integer netbiosNodeType) {
            this.netbiosNodeType = Input.ofNullable(netbiosNodeType);
            return this;
        }

        public Builder ntpServers(@Nullable Input<List<String>> ntpServers) {
            this.ntpServers = ntpServers;
            return this;
        }

        public Builder ntpServers(@Nullable List<String> ntpServers) {
            this.ntpServers = Input.ofNullable(ntpServers);
            return this;
        }

        public Builder tags(@Nullable Input<List<DHCPOptionsTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<DHCPOptionsTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DHCPOptionsArgs build() {
            return new DHCPOptionsArgs(domainName, domainNameServers, netbiosNameServers, netbiosNodeType, ntpServers, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache network settings.
 * 
 */
public final class CacheNetworkSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheNetworkSettingsArgs Empty = new CacheNetworkSettingsArgs();

    /**
     * DNS search domain
     * 
     */
    @Import(name="dnsSearchDomain")
    private @Nullable Output<String> dnsSearchDomain;

    public Optional<Output<String>> dnsSearchDomain() {
        return Optional.ofNullable(this.dnsSearchDomain);
    }

    /**
     * DNS servers for the cache to use.  It will be set from the network configuration if no value is provided.
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<List<String>> dnsServers;

    public Optional<Output<List<String>>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * The IPv4 maximum transmission unit configured for the subnet.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * NTP server IP Address or FQDN for the cache to use. The default is time.windows.com.
     * 
     */
    @Import(name="ntpServer")
    private @Nullable Output<String> ntpServer;

    public Optional<Output<String>> ntpServer() {
        return Optional.ofNullable(this.ntpServer);
    }

    private CacheNetworkSettingsArgs() {}

    private CacheNetworkSettingsArgs(CacheNetworkSettingsArgs $) {
        this.dnsSearchDomain = $.dnsSearchDomain;
        this.dnsServers = $.dnsServers;
        this.mtu = $.mtu;
        this.ntpServer = $.ntpServer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheNetworkSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheNetworkSettingsArgs $;

        public Builder() {
            $ = new CacheNetworkSettingsArgs();
        }

        public Builder(CacheNetworkSettingsArgs defaults) {
            $ = new CacheNetworkSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsSearchDomain(@Nullable Output<String> dnsSearchDomain) {
            $.dnsSearchDomain = dnsSearchDomain;
            return this;
        }

        public Builder dnsSearchDomain(String dnsSearchDomain) {
            return dnsSearchDomain(Output.of(dnsSearchDomain));
        }

        public Builder dnsServers(@Nullable Output<List<String>> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        public Builder dnsServers(List<String> dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }

        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        public Builder ntpServer(@Nullable Output<String> ntpServer) {
            $.ntpServer = ntpServer;
            return this;
        }

        public Builder ntpServer(String ntpServer) {
            return ntpServer(Output.of(ntpServer));
        }

        public CacheNetworkSettingsArgs build() {
            $.mtu = Codegen.integerProp("mtu").output().arg($.mtu).def(1500).getNullable();
            $.ntpServer = Codegen.stringProp("ntpServer").output().arg($.ntpServer).def("time.windows.com").getNullable();
            return $;
        }
    }

}

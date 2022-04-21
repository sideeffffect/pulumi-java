// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sysctl settings for Linux agent nodes.
 * 
 */
public final class SysctlConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SysctlConfigArgs Empty = new SysctlConfigArgs();

    /**
     * Sysctl setting fs.aio-max-nr.
     * 
     */
    @Import(name="fsAioMaxNr")
    private @Nullable Output<Integer> fsAioMaxNr;

    public Optional<Output<Integer>> fsAioMaxNr() {
        return Optional.ofNullable(this.fsAioMaxNr);
    }

    /**
     * Sysctl setting fs.file-max.
     * 
     */
    @Import(name="fsFileMax")
    private @Nullable Output<Integer> fsFileMax;

    public Optional<Output<Integer>> fsFileMax() {
        return Optional.ofNullable(this.fsFileMax);
    }

    /**
     * Sysctl setting fs.inotify.max_user_watches.
     * 
     */
    @Import(name="fsInotifyMaxUserWatches")
    private @Nullable Output<Integer> fsInotifyMaxUserWatches;

    public Optional<Output<Integer>> fsInotifyMaxUserWatches() {
        return Optional.ofNullable(this.fsInotifyMaxUserWatches);
    }

    /**
     * Sysctl setting fs.nr_open.
     * 
     */
    @Import(name="fsNrOpen")
    private @Nullable Output<Integer> fsNrOpen;

    public Optional<Output<Integer>> fsNrOpen() {
        return Optional.ofNullable(this.fsNrOpen);
    }

    /**
     * Sysctl setting kernel.threads-max.
     * 
     */
    @Import(name="kernelThreadsMax")
    private @Nullable Output<Integer> kernelThreadsMax;

    public Optional<Output<Integer>> kernelThreadsMax() {
        return Optional.ofNullable(this.kernelThreadsMax);
    }

    /**
     * Sysctl setting net.core.netdev_max_backlog.
     * 
     */
    @Import(name="netCoreNetdevMaxBacklog")
    private @Nullable Output<Integer> netCoreNetdevMaxBacklog;

    public Optional<Output<Integer>> netCoreNetdevMaxBacklog() {
        return Optional.ofNullable(this.netCoreNetdevMaxBacklog);
    }

    /**
     * Sysctl setting net.core.optmem_max.
     * 
     */
    @Import(name="netCoreOptmemMax")
    private @Nullable Output<Integer> netCoreOptmemMax;

    public Optional<Output<Integer>> netCoreOptmemMax() {
        return Optional.ofNullable(this.netCoreOptmemMax);
    }

    /**
     * Sysctl setting net.core.rmem_default.
     * 
     */
    @Import(name="netCoreRmemDefault")
    private @Nullable Output<Integer> netCoreRmemDefault;

    public Optional<Output<Integer>> netCoreRmemDefault() {
        return Optional.ofNullable(this.netCoreRmemDefault);
    }

    /**
     * Sysctl setting net.core.rmem_max.
     * 
     */
    @Import(name="netCoreRmemMax")
    private @Nullable Output<Integer> netCoreRmemMax;

    public Optional<Output<Integer>> netCoreRmemMax() {
        return Optional.ofNullable(this.netCoreRmemMax);
    }

    /**
     * Sysctl setting net.core.somaxconn.
     * 
     */
    @Import(name="netCoreSomaxconn")
    private @Nullable Output<Integer> netCoreSomaxconn;

    public Optional<Output<Integer>> netCoreSomaxconn() {
        return Optional.ofNullable(this.netCoreSomaxconn);
    }

    /**
     * Sysctl setting net.core.wmem_default.
     * 
     */
    @Import(name="netCoreWmemDefault")
    private @Nullable Output<Integer> netCoreWmemDefault;

    public Optional<Output<Integer>> netCoreWmemDefault() {
        return Optional.ofNullable(this.netCoreWmemDefault);
    }

    /**
     * Sysctl setting net.core.wmem_max.
     * 
     */
    @Import(name="netCoreWmemMax")
    private @Nullable Output<Integer> netCoreWmemMax;

    public Optional<Output<Integer>> netCoreWmemMax() {
        return Optional.ofNullable(this.netCoreWmemMax);
    }

    /**
     * Sysctl setting net.ipv4.ip_local_port_range.
     * 
     */
    @Import(name="netIpv4IpLocalPortRange")
    private @Nullable Output<String> netIpv4IpLocalPortRange;

    public Optional<Output<String>> netIpv4IpLocalPortRange() {
        return Optional.ofNullable(this.netIpv4IpLocalPortRange);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh1.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh1")
    private @Nullable Output<Integer> netIpv4NeighDefaultGcThresh1;

    public Optional<Output<Integer>> netIpv4NeighDefaultGcThresh1() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh1);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh2.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh2")
    private @Nullable Output<Integer> netIpv4NeighDefaultGcThresh2;

    public Optional<Output<Integer>> netIpv4NeighDefaultGcThresh2() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh2);
    }

    /**
     * Sysctl setting net.ipv4.neigh.default.gc_thresh3.
     * 
     */
    @Import(name="netIpv4NeighDefaultGcThresh3")
    private @Nullable Output<Integer> netIpv4NeighDefaultGcThresh3;

    public Optional<Output<Integer>> netIpv4NeighDefaultGcThresh3() {
        return Optional.ofNullable(this.netIpv4NeighDefaultGcThresh3);
    }

    /**
     * Sysctl setting net.ipv4.tcp_fin_timeout.
     * 
     */
    @Import(name="netIpv4TcpFinTimeout")
    private @Nullable Output<Integer> netIpv4TcpFinTimeout;

    public Optional<Output<Integer>> netIpv4TcpFinTimeout() {
        return Optional.ofNullable(this.netIpv4TcpFinTimeout);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_probes.
     * 
     */
    @Import(name="netIpv4TcpKeepaliveProbes")
    private @Nullable Output<Integer> netIpv4TcpKeepaliveProbes;

    public Optional<Output<Integer>> netIpv4TcpKeepaliveProbes() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveProbes);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_time.
     * 
     */
    @Import(name="netIpv4TcpKeepaliveTime")
    private @Nullable Output<Integer> netIpv4TcpKeepaliveTime;

    public Optional<Output<Integer>> netIpv4TcpKeepaliveTime() {
        return Optional.ofNullable(this.netIpv4TcpKeepaliveTime);
    }

    /**
     * Sysctl setting net.ipv4.tcp_max_syn_backlog.
     * 
     */
    @Import(name="netIpv4TcpMaxSynBacklog")
    private @Nullable Output<Integer> netIpv4TcpMaxSynBacklog;

    public Optional<Output<Integer>> netIpv4TcpMaxSynBacklog() {
        return Optional.ofNullable(this.netIpv4TcpMaxSynBacklog);
    }

    /**
     * Sysctl setting net.ipv4.tcp_max_tw_buckets.
     * 
     */
    @Import(name="netIpv4TcpMaxTwBuckets")
    private @Nullable Output<Integer> netIpv4TcpMaxTwBuckets;

    public Optional<Output<Integer>> netIpv4TcpMaxTwBuckets() {
        return Optional.ofNullable(this.netIpv4TcpMaxTwBuckets);
    }

    /**
     * Sysctl setting net.ipv4.tcp_tw_reuse.
     * 
     */
    @Import(name="netIpv4TcpTwReuse")
    private @Nullable Output<Boolean> netIpv4TcpTwReuse;

    public Optional<Output<Boolean>> netIpv4TcpTwReuse() {
        return Optional.ofNullable(this.netIpv4TcpTwReuse);
    }

    /**
     * Sysctl setting net.ipv4.tcp_keepalive_intvl.
     * 
     */
    @Import(name="netIpv4TcpkeepaliveIntvl")
    private @Nullable Output<Integer> netIpv4TcpkeepaliveIntvl;

    public Optional<Output<Integer>> netIpv4TcpkeepaliveIntvl() {
        return Optional.ofNullable(this.netIpv4TcpkeepaliveIntvl);
    }

    /**
     * Sysctl setting net.netfilter.nf_conntrack_buckets.
     * 
     */
    @Import(name="netNetfilterNfConntrackBuckets")
    private @Nullable Output<Integer> netNetfilterNfConntrackBuckets;

    public Optional<Output<Integer>> netNetfilterNfConntrackBuckets() {
        return Optional.ofNullable(this.netNetfilterNfConntrackBuckets);
    }

    /**
     * Sysctl setting net.netfilter.nf_conntrack_max.
     * 
     */
    @Import(name="netNetfilterNfConntrackMax")
    private @Nullable Output<Integer> netNetfilterNfConntrackMax;

    public Optional<Output<Integer>> netNetfilterNfConntrackMax() {
        return Optional.ofNullable(this.netNetfilterNfConntrackMax);
    }

    /**
     * Sysctl setting vm.max_map_count.
     * 
     */
    @Import(name="vmMaxMapCount")
    private @Nullable Output<Integer> vmMaxMapCount;

    public Optional<Output<Integer>> vmMaxMapCount() {
        return Optional.ofNullable(this.vmMaxMapCount);
    }

    /**
     * Sysctl setting vm.swappiness.
     * 
     */
    @Import(name="vmSwappiness")
    private @Nullable Output<Integer> vmSwappiness;

    public Optional<Output<Integer>> vmSwappiness() {
        return Optional.ofNullable(this.vmSwappiness);
    }

    /**
     * Sysctl setting vm.vfs_cache_pressure.
     * 
     */
    @Import(name="vmVfsCachePressure")
    private @Nullable Output<Integer> vmVfsCachePressure;

    public Optional<Output<Integer>> vmVfsCachePressure() {
        return Optional.ofNullable(this.vmVfsCachePressure);
    }

    private SysctlConfigArgs() {}

    private SysctlConfigArgs(SysctlConfigArgs $) {
        this.fsAioMaxNr = $.fsAioMaxNr;
        this.fsFileMax = $.fsFileMax;
        this.fsInotifyMaxUserWatches = $.fsInotifyMaxUserWatches;
        this.fsNrOpen = $.fsNrOpen;
        this.kernelThreadsMax = $.kernelThreadsMax;
        this.netCoreNetdevMaxBacklog = $.netCoreNetdevMaxBacklog;
        this.netCoreOptmemMax = $.netCoreOptmemMax;
        this.netCoreRmemDefault = $.netCoreRmemDefault;
        this.netCoreRmemMax = $.netCoreRmemMax;
        this.netCoreSomaxconn = $.netCoreSomaxconn;
        this.netCoreWmemDefault = $.netCoreWmemDefault;
        this.netCoreWmemMax = $.netCoreWmemMax;
        this.netIpv4IpLocalPortRange = $.netIpv4IpLocalPortRange;
        this.netIpv4NeighDefaultGcThresh1 = $.netIpv4NeighDefaultGcThresh1;
        this.netIpv4NeighDefaultGcThresh2 = $.netIpv4NeighDefaultGcThresh2;
        this.netIpv4NeighDefaultGcThresh3 = $.netIpv4NeighDefaultGcThresh3;
        this.netIpv4TcpFinTimeout = $.netIpv4TcpFinTimeout;
        this.netIpv4TcpKeepaliveProbes = $.netIpv4TcpKeepaliveProbes;
        this.netIpv4TcpKeepaliveTime = $.netIpv4TcpKeepaliveTime;
        this.netIpv4TcpMaxSynBacklog = $.netIpv4TcpMaxSynBacklog;
        this.netIpv4TcpMaxTwBuckets = $.netIpv4TcpMaxTwBuckets;
        this.netIpv4TcpTwReuse = $.netIpv4TcpTwReuse;
        this.netIpv4TcpkeepaliveIntvl = $.netIpv4TcpkeepaliveIntvl;
        this.netNetfilterNfConntrackBuckets = $.netNetfilterNfConntrackBuckets;
        this.netNetfilterNfConntrackMax = $.netNetfilterNfConntrackMax;
        this.vmMaxMapCount = $.vmMaxMapCount;
        this.vmSwappiness = $.vmSwappiness;
        this.vmVfsCachePressure = $.vmVfsCachePressure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SysctlConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SysctlConfigArgs $;

        public Builder() {
            $ = new SysctlConfigArgs();
        }

        public Builder(SysctlConfigArgs defaults) {
            $ = new SysctlConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder fsAioMaxNr(@Nullable Output<Integer> fsAioMaxNr) {
            $.fsAioMaxNr = fsAioMaxNr;
            return this;
        }

        public Builder fsAioMaxNr(Integer fsAioMaxNr) {
            return fsAioMaxNr(Output.of(fsAioMaxNr));
        }

        public Builder fsFileMax(@Nullable Output<Integer> fsFileMax) {
            $.fsFileMax = fsFileMax;
            return this;
        }

        public Builder fsFileMax(Integer fsFileMax) {
            return fsFileMax(Output.of(fsFileMax));
        }

        public Builder fsInotifyMaxUserWatches(@Nullable Output<Integer> fsInotifyMaxUserWatches) {
            $.fsInotifyMaxUserWatches = fsInotifyMaxUserWatches;
            return this;
        }

        public Builder fsInotifyMaxUserWatches(Integer fsInotifyMaxUserWatches) {
            return fsInotifyMaxUserWatches(Output.of(fsInotifyMaxUserWatches));
        }

        public Builder fsNrOpen(@Nullable Output<Integer> fsNrOpen) {
            $.fsNrOpen = fsNrOpen;
            return this;
        }

        public Builder fsNrOpen(Integer fsNrOpen) {
            return fsNrOpen(Output.of(fsNrOpen));
        }

        public Builder kernelThreadsMax(@Nullable Output<Integer> kernelThreadsMax) {
            $.kernelThreadsMax = kernelThreadsMax;
            return this;
        }

        public Builder kernelThreadsMax(Integer kernelThreadsMax) {
            return kernelThreadsMax(Output.of(kernelThreadsMax));
        }

        public Builder netCoreNetdevMaxBacklog(@Nullable Output<Integer> netCoreNetdevMaxBacklog) {
            $.netCoreNetdevMaxBacklog = netCoreNetdevMaxBacklog;
            return this;
        }

        public Builder netCoreNetdevMaxBacklog(Integer netCoreNetdevMaxBacklog) {
            return netCoreNetdevMaxBacklog(Output.of(netCoreNetdevMaxBacklog));
        }

        public Builder netCoreOptmemMax(@Nullable Output<Integer> netCoreOptmemMax) {
            $.netCoreOptmemMax = netCoreOptmemMax;
            return this;
        }

        public Builder netCoreOptmemMax(Integer netCoreOptmemMax) {
            return netCoreOptmemMax(Output.of(netCoreOptmemMax));
        }

        public Builder netCoreRmemDefault(@Nullable Output<Integer> netCoreRmemDefault) {
            $.netCoreRmemDefault = netCoreRmemDefault;
            return this;
        }

        public Builder netCoreRmemDefault(Integer netCoreRmemDefault) {
            return netCoreRmemDefault(Output.of(netCoreRmemDefault));
        }

        public Builder netCoreRmemMax(@Nullable Output<Integer> netCoreRmemMax) {
            $.netCoreRmemMax = netCoreRmemMax;
            return this;
        }

        public Builder netCoreRmemMax(Integer netCoreRmemMax) {
            return netCoreRmemMax(Output.of(netCoreRmemMax));
        }

        public Builder netCoreSomaxconn(@Nullable Output<Integer> netCoreSomaxconn) {
            $.netCoreSomaxconn = netCoreSomaxconn;
            return this;
        }

        public Builder netCoreSomaxconn(Integer netCoreSomaxconn) {
            return netCoreSomaxconn(Output.of(netCoreSomaxconn));
        }

        public Builder netCoreWmemDefault(@Nullable Output<Integer> netCoreWmemDefault) {
            $.netCoreWmemDefault = netCoreWmemDefault;
            return this;
        }

        public Builder netCoreWmemDefault(Integer netCoreWmemDefault) {
            return netCoreWmemDefault(Output.of(netCoreWmemDefault));
        }

        public Builder netCoreWmemMax(@Nullable Output<Integer> netCoreWmemMax) {
            $.netCoreWmemMax = netCoreWmemMax;
            return this;
        }

        public Builder netCoreWmemMax(Integer netCoreWmemMax) {
            return netCoreWmemMax(Output.of(netCoreWmemMax));
        }

        public Builder netIpv4IpLocalPortRange(@Nullable Output<String> netIpv4IpLocalPortRange) {
            $.netIpv4IpLocalPortRange = netIpv4IpLocalPortRange;
            return this;
        }

        public Builder netIpv4IpLocalPortRange(String netIpv4IpLocalPortRange) {
            return netIpv4IpLocalPortRange(Output.of(netIpv4IpLocalPortRange));
        }

        public Builder netIpv4NeighDefaultGcThresh1(@Nullable Output<Integer> netIpv4NeighDefaultGcThresh1) {
            $.netIpv4NeighDefaultGcThresh1 = netIpv4NeighDefaultGcThresh1;
            return this;
        }

        public Builder netIpv4NeighDefaultGcThresh1(Integer netIpv4NeighDefaultGcThresh1) {
            return netIpv4NeighDefaultGcThresh1(Output.of(netIpv4NeighDefaultGcThresh1));
        }

        public Builder netIpv4NeighDefaultGcThresh2(@Nullable Output<Integer> netIpv4NeighDefaultGcThresh2) {
            $.netIpv4NeighDefaultGcThresh2 = netIpv4NeighDefaultGcThresh2;
            return this;
        }

        public Builder netIpv4NeighDefaultGcThresh2(Integer netIpv4NeighDefaultGcThresh2) {
            return netIpv4NeighDefaultGcThresh2(Output.of(netIpv4NeighDefaultGcThresh2));
        }

        public Builder netIpv4NeighDefaultGcThresh3(@Nullable Output<Integer> netIpv4NeighDefaultGcThresh3) {
            $.netIpv4NeighDefaultGcThresh3 = netIpv4NeighDefaultGcThresh3;
            return this;
        }

        public Builder netIpv4NeighDefaultGcThresh3(Integer netIpv4NeighDefaultGcThresh3) {
            return netIpv4NeighDefaultGcThresh3(Output.of(netIpv4NeighDefaultGcThresh3));
        }

        public Builder netIpv4TcpFinTimeout(@Nullable Output<Integer> netIpv4TcpFinTimeout) {
            $.netIpv4TcpFinTimeout = netIpv4TcpFinTimeout;
            return this;
        }

        public Builder netIpv4TcpFinTimeout(Integer netIpv4TcpFinTimeout) {
            return netIpv4TcpFinTimeout(Output.of(netIpv4TcpFinTimeout));
        }

        public Builder netIpv4TcpKeepaliveProbes(@Nullable Output<Integer> netIpv4TcpKeepaliveProbes) {
            $.netIpv4TcpKeepaliveProbes = netIpv4TcpKeepaliveProbes;
            return this;
        }

        public Builder netIpv4TcpKeepaliveProbes(Integer netIpv4TcpKeepaliveProbes) {
            return netIpv4TcpKeepaliveProbes(Output.of(netIpv4TcpKeepaliveProbes));
        }

        public Builder netIpv4TcpKeepaliveTime(@Nullable Output<Integer> netIpv4TcpKeepaliveTime) {
            $.netIpv4TcpKeepaliveTime = netIpv4TcpKeepaliveTime;
            return this;
        }

        public Builder netIpv4TcpKeepaliveTime(Integer netIpv4TcpKeepaliveTime) {
            return netIpv4TcpKeepaliveTime(Output.of(netIpv4TcpKeepaliveTime));
        }

        public Builder netIpv4TcpMaxSynBacklog(@Nullable Output<Integer> netIpv4TcpMaxSynBacklog) {
            $.netIpv4TcpMaxSynBacklog = netIpv4TcpMaxSynBacklog;
            return this;
        }

        public Builder netIpv4TcpMaxSynBacklog(Integer netIpv4TcpMaxSynBacklog) {
            return netIpv4TcpMaxSynBacklog(Output.of(netIpv4TcpMaxSynBacklog));
        }

        public Builder netIpv4TcpMaxTwBuckets(@Nullable Output<Integer> netIpv4TcpMaxTwBuckets) {
            $.netIpv4TcpMaxTwBuckets = netIpv4TcpMaxTwBuckets;
            return this;
        }

        public Builder netIpv4TcpMaxTwBuckets(Integer netIpv4TcpMaxTwBuckets) {
            return netIpv4TcpMaxTwBuckets(Output.of(netIpv4TcpMaxTwBuckets));
        }

        public Builder netIpv4TcpTwReuse(@Nullable Output<Boolean> netIpv4TcpTwReuse) {
            $.netIpv4TcpTwReuse = netIpv4TcpTwReuse;
            return this;
        }

        public Builder netIpv4TcpTwReuse(Boolean netIpv4TcpTwReuse) {
            return netIpv4TcpTwReuse(Output.of(netIpv4TcpTwReuse));
        }

        public Builder netIpv4TcpkeepaliveIntvl(@Nullable Output<Integer> netIpv4TcpkeepaliveIntvl) {
            $.netIpv4TcpkeepaliveIntvl = netIpv4TcpkeepaliveIntvl;
            return this;
        }

        public Builder netIpv4TcpkeepaliveIntvl(Integer netIpv4TcpkeepaliveIntvl) {
            return netIpv4TcpkeepaliveIntvl(Output.of(netIpv4TcpkeepaliveIntvl));
        }

        public Builder netNetfilterNfConntrackBuckets(@Nullable Output<Integer> netNetfilterNfConntrackBuckets) {
            $.netNetfilterNfConntrackBuckets = netNetfilterNfConntrackBuckets;
            return this;
        }

        public Builder netNetfilterNfConntrackBuckets(Integer netNetfilterNfConntrackBuckets) {
            return netNetfilterNfConntrackBuckets(Output.of(netNetfilterNfConntrackBuckets));
        }

        public Builder netNetfilterNfConntrackMax(@Nullable Output<Integer> netNetfilterNfConntrackMax) {
            $.netNetfilterNfConntrackMax = netNetfilterNfConntrackMax;
            return this;
        }

        public Builder netNetfilterNfConntrackMax(Integer netNetfilterNfConntrackMax) {
            return netNetfilterNfConntrackMax(Output.of(netNetfilterNfConntrackMax));
        }

        public Builder vmMaxMapCount(@Nullable Output<Integer> vmMaxMapCount) {
            $.vmMaxMapCount = vmMaxMapCount;
            return this;
        }

        public Builder vmMaxMapCount(Integer vmMaxMapCount) {
            return vmMaxMapCount(Output.of(vmMaxMapCount));
        }

        public Builder vmSwappiness(@Nullable Output<Integer> vmSwappiness) {
            $.vmSwappiness = vmSwappiness;
            return this;
        }

        public Builder vmSwappiness(Integer vmSwappiness) {
            return vmSwappiness(Output.of(vmSwappiness));
        }

        public Builder vmVfsCachePressure(@Nullable Output<Integer> vmVfsCachePressure) {
            $.vmVfsCachePressure = vmVfsCachePressure;
            return this;
        }

        public Builder vmVfsCachePressure(Integer vmVfsCachePressure) {
            return vmVfsCachePressure(Output.of(vmVfsCachePressure));
        }

        public SysctlConfigArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OntapStorageVirtualMachineEndpointManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final OntapStorageVirtualMachineEndpointManagementArgs Empty = new OntapStorageVirtualMachineEndpointManagementArgs();

    /**
     * The Domain Name Service (DNS) name for the storage virtual machine. You can mount your storage virtual machine using its DNS name.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * IP addresses of the storage virtual machine endpoint.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    private OntapStorageVirtualMachineEndpointManagementArgs() {}

    private OntapStorageVirtualMachineEndpointManagementArgs(OntapStorageVirtualMachineEndpointManagementArgs $) {
        this.dnsName = $.dnsName;
        this.ipAddresses = $.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OntapStorageVirtualMachineEndpointManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OntapStorageVirtualMachineEndpointManagementArgs $;

        public Builder() {
            $ = new OntapStorageVirtualMachineEndpointManagementArgs();
        }

        public Builder(OntapStorageVirtualMachineEndpointManagementArgs defaults) {
            $ = new OntapStorageVirtualMachineEndpointManagementArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        public OntapStorageVirtualMachineEndpointManagementArgs build() {
            return $;
        }
    }

}

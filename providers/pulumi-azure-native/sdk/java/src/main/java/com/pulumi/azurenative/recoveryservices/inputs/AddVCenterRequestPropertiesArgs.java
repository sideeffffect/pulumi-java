// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of an add vCenter request.
 * 
 */
public final class AddVCenterRequestPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AddVCenterRequestPropertiesArgs Empty = new AddVCenterRequestPropertiesArgs();

    /**
     * The friendly name of the vCenter.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return The friendly name of the vCenter.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * The IP address of the vCenter to be discovered.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address of the vCenter to be discovered.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The port number for discovery.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return The port number for discovery.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The process server Id from where the discovery is orchestrated.
     * 
     */
    @Import(name="processServerId")
    private @Nullable Output<String> processServerId;

    /**
     * @return The process server Id from where the discovery is orchestrated.
     * 
     */
    public Optional<Output<String>> processServerId() {
        return Optional.ofNullable(this.processServerId);
    }

    /**
     * The account Id which has privileges to discover the vCenter.
     * 
     */
    @Import(name="runAsAccountId")
    private @Nullable Output<String> runAsAccountId;

    /**
     * @return The account Id which has privileges to discover the vCenter.
     * 
     */
    public Optional<Output<String>> runAsAccountId() {
        return Optional.ofNullable(this.runAsAccountId);
    }

    private AddVCenterRequestPropertiesArgs() {}

    private AddVCenterRequestPropertiesArgs(AddVCenterRequestPropertiesArgs $) {
        this.friendlyName = $.friendlyName;
        this.ipAddress = $.ipAddress;
        this.port = $.port;
        this.processServerId = $.processServerId;
        this.runAsAccountId = $.runAsAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddVCenterRequestPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddVCenterRequestPropertiesArgs $;

        public Builder() {
            $ = new AddVCenterRequestPropertiesArgs();
        }

        public Builder(AddVCenterRequestPropertiesArgs defaults) {
            $ = new AddVCenterRequestPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param friendlyName The friendly name of the vCenter.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName The friendly name of the vCenter.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param ipAddress The IP address of the vCenter to be discovered.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the vCenter to be discovered.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param port The port number for discovery.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number for discovery.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param processServerId The process server Id from where the discovery is orchestrated.
         * 
         * @return builder
         * 
         */
        public Builder processServerId(@Nullable Output<String> processServerId) {
            $.processServerId = processServerId;
            return this;
        }

        /**
         * @param processServerId The process server Id from where the discovery is orchestrated.
         * 
         * @return builder
         * 
         */
        public Builder processServerId(String processServerId) {
            return processServerId(Output.of(processServerId));
        }

        /**
         * @param runAsAccountId The account Id which has privileges to discover the vCenter.
         * 
         * @return builder
         * 
         */
        public Builder runAsAccountId(@Nullable Output<String> runAsAccountId) {
            $.runAsAccountId = runAsAccountId;
            return this;
        }

        /**
         * @param runAsAccountId The account Id which has privileges to discover the vCenter.
         * 
         * @return builder
         * 
         */
        public Builder runAsAccountId(String runAsAccountId) {
            return runAsAccountId(Output.of(runAsAccountId));
        }

        public AddVCenterRequestPropertiesArgs build() {
            return $;
        }
    }

}

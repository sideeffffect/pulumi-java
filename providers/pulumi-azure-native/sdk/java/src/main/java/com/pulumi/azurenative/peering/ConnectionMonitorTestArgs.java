// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionMonitorTestArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorTestArgs Empty = new ConnectionMonitorTestArgs();

    /**
     * The name of the connection monitor test
     * 
     */
    @Import(name="connectionMonitorTestName")
    private @Nullable Output<String> connectionMonitorTestName;

    public Optional<Output<String>> connectionMonitorTestName() {
        return Optional.ofNullable(this.connectionMonitorTestName);
    }

    /**
     * The Connection Monitor test destination
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The Connection Monitor test destination port
     * 
     */
    @Import(name="destinationPort")
    private @Nullable Output<Integer> destinationPort;

    public Optional<Output<Integer>> destinationPort() {
        return Optional.ofNullable(this.destinationPort);
    }

    /**
     * The name of the peering service.
     * 
     */
    @Import(name="peeringServiceName", required=true)
    private Output<String> peeringServiceName;

    public Output<String> peeringServiceName() {
        return this.peeringServiceName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Connection Monitor test source agent
     * 
     */
    @Import(name="sourceAgent")
    private @Nullable Output<String> sourceAgent;

    public Optional<Output<String>> sourceAgent() {
        return Optional.ofNullable(this.sourceAgent);
    }

    /**
     * The Connection Monitor test frequency in seconds
     * 
     */
    @Import(name="testFrequencyInSec")
    private @Nullable Output<Integer> testFrequencyInSec;

    public Optional<Output<Integer>> testFrequencyInSec() {
        return Optional.ofNullable(this.testFrequencyInSec);
    }

    private ConnectionMonitorTestArgs() {}

    private ConnectionMonitorTestArgs(ConnectionMonitorTestArgs $) {
        this.connectionMonitorTestName = $.connectionMonitorTestName;
        this.destination = $.destination;
        this.destinationPort = $.destinationPort;
        this.peeringServiceName = $.peeringServiceName;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceAgent = $.sourceAgent;
        this.testFrequencyInSec = $.testFrequencyInSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorTestArgs $;

        public Builder() {
            $ = new ConnectionMonitorTestArgs();
        }

        public Builder(ConnectionMonitorTestArgs defaults) {
            $ = new ConnectionMonitorTestArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionMonitorTestName(@Nullable Output<String> connectionMonitorTestName) {
            $.connectionMonitorTestName = connectionMonitorTestName;
            return this;
        }

        public Builder connectionMonitorTestName(String connectionMonitorTestName) {
            return connectionMonitorTestName(Output.of(connectionMonitorTestName));
        }

        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            $.destinationPort = destinationPort;
            return this;
        }

        public Builder destinationPort(Integer destinationPort) {
            return destinationPort(Output.of(destinationPort));
        }

        public Builder peeringServiceName(Output<String> peeringServiceName) {
            $.peeringServiceName = peeringServiceName;
            return this;
        }

        public Builder peeringServiceName(String peeringServiceName) {
            return peeringServiceName(Output.of(peeringServiceName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sourceAgent(@Nullable Output<String> sourceAgent) {
            $.sourceAgent = sourceAgent;
            return this;
        }

        public Builder sourceAgent(String sourceAgent) {
            return sourceAgent(Output.of(sourceAgent));
        }

        public Builder testFrequencyInSec(@Nullable Output<Integer> testFrequencyInSec) {
            $.testFrequencyInSec = testFrequencyInSec;
            return this;
        }

        public Builder testFrequencyInSec(Integer testFrequencyInSec) {
            return testFrequencyInSec(Output.of(testFrequencyInSec));
        }

        public ConnectionMonitorTestArgs build() {
            $.peeringServiceName = Objects.requireNonNull($.peeringServiceName, "expected parameter 'peeringServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}

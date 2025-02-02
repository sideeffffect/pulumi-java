// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an IoT Hub input data source that contains stream data.
 * 
 */
public final class IoTHubStreamInputDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IoTHubStreamInputDataSourceArgs Empty = new IoTHubStreamInputDataSourceArgs();

    /**
     * The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     * 
     */
    @Import(name="consumerGroupName")
    private @Nullable Output<String> consumerGroupName;

    /**
     * @return The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
     * 
     */
    public Optional<Output<String>> consumerGroupName() {
        return Optional.ofNullable(this.consumerGroupName);
    }

    /**
     * The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="iotHubNamespace")
    private @Nullable Output<String> iotHubNamespace;

    /**
     * @return The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<String>> iotHubNamespace() {
        return Optional.ofNullable(this.iotHubNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyKey")
    private @Nullable Output<String> sharedAccessPolicyKey;

    /**
     * @return The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<String>> sharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyName")
    private @Nullable Output<String> sharedAccessPolicyName;

    /**
     * @return The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<String>> sharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Devices/IotHubs&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is &#39;Microsoft.Devices/IotHubs&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private IoTHubStreamInputDataSourceArgs() {}

    private IoTHubStreamInputDataSourceArgs(IoTHubStreamInputDataSourceArgs $) {
        this.consumerGroupName = $.consumerGroupName;
        this.endpoint = $.endpoint;
        this.iotHubNamespace = $.iotHubNamespace;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IoTHubStreamInputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IoTHubStreamInputDataSourceArgs $;

        public Builder() {
            $ = new IoTHubStreamInputDataSourceArgs();
        }

        public Builder(IoTHubStreamInputDataSourceArgs defaults) {
            $ = new IoTHubStreamInputDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumerGroupName The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroupName(@Nullable Output<String> consumerGroupName) {
            $.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * @param consumerGroupName The name of an IoT Hub Consumer Group that should be used to read events from the IoT Hub. If not specified, the input uses the Iot Hub’s default consumer group.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroupName(String consumerGroupName) {
            return consumerGroupName(Output.of(consumerGroupName));
        }

        /**
         * @param endpoint The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The IoT Hub endpoint to connect to (ie. messages/events, messages/operationsMonitoringEvents, etc.).
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param iotHubNamespace The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder iotHubNamespace(@Nullable Output<String> iotHubNamespace) {
            $.iotHubNamespace = iotHubNamespace;
            return this;
        }

        /**
         * @param iotHubNamespace The name or the URI of the IoT Hub. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder iotHubNamespace(String iotHubNamespace) {
            return iotHubNamespace(Output.of(iotHubNamespace));
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(@Nullable Output<String> sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(String sharedAccessPolicyKey) {
            return sharedAccessPolicyKey(Output.of(sharedAccessPolicyKey));
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(@Nullable Output<String> sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the IoT Hub. This policy must contain at least the Service connect permission. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            return sharedAccessPolicyName(Output.of(sharedAccessPolicyName));
        }

        /**
         * @param type Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.Devices/IotHubs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
         * Expected value is &#39;Microsoft.Devices/IotHubs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IoTHubStreamInputDataSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}

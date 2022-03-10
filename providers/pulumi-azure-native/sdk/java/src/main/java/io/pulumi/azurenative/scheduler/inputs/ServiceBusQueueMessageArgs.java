// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.ServiceBusTransportType;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusAuthenticationArgs;
import io.pulumi.azurenative.scheduler.inputs.ServiceBusBrokeredMessagePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusQueueMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusQueueMessageArgs Empty = new ServiceBusQueueMessageArgs();

    /**
     * Gets or sets the Service Bus authentication.
     * 
     */
    @InputImport(name="authentication")
      private final @Nullable Input<ServiceBusAuthenticationArgs> authentication;

    public Input<ServiceBusAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    /**
     * Gets or sets the brokered message properties.
     * 
     */
    @InputImport(name="brokeredMessageProperties")
      private final @Nullable Input<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties;

    public Input<ServiceBusBrokeredMessagePropertiesArgs> getBrokeredMessageProperties() {
        return this.brokeredMessageProperties == null ? Input.empty() : this.brokeredMessageProperties;
    }

    /**
     * Gets or sets the custom message properties.
     * 
     */
    @InputImport(name="customMessageProperties")
      private final @Nullable Input<Map<String,String>> customMessageProperties;

    public Input<Map<String,String>> getCustomMessageProperties() {
        return this.customMessageProperties == null ? Input.empty() : this.customMessageProperties;
    }

    /**
     * Gets or sets the message.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Gets or sets the namespace.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * Gets or sets the queue name.
     * 
     */
    @InputImport(name="queueName")
      private final @Nullable Input<String> queueName;

    public Input<String> getQueueName() {
        return this.queueName == null ? Input.empty() : this.queueName;
    }

    /**
     * Gets or sets the transport type.
     * 
     */
    @InputImport(name="transportType")
      private final @Nullable Input<ServiceBusTransportType> transportType;

    public Input<ServiceBusTransportType> getTransportType() {
        return this.transportType == null ? Input.empty() : this.transportType;
    }

    public ServiceBusQueueMessageArgs(
        @Nullable Input<ServiceBusAuthenticationArgs> authentication,
        @Nullable Input<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties,
        @Nullable Input<Map<String,String>> customMessageProperties,
        @Nullable Input<String> message,
        @Nullable Input<String> namespace,
        @Nullable Input<String> queueName,
        @Nullable Input<ServiceBusTransportType> transportType) {
        this.authentication = authentication;
        this.brokeredMessageProperties = brokeredMessageProperties;
        this.customMessageProperties = customMessageProperties;
        this.message = message;
        this.namespace = namespace;
        this.queueName = queueName;
        this.transportType = transportType;
    }

    private ServiceBusQueueMessageArgs() {
        this.authentication = Input.empty();
        this.brokeredMessageProperties = Input.empty();
        this.customMessageProperties = Input.empty();
        this.message = Input.empty();
        this.namespace = Input.empty();
        this.queueName = Input.empty();
        this.transportType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusQueueMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceBusAuthenticationArgs> authentication;
        private @Nullable Input<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties;
        private @Nullable Input<Map<String,String>> customMessageProperties;
        private @Nullable Input<String> message;
        private @Nullable Input<String> namespace;
        private @Nullable Input<String> queueName;
        private @Nullable Input<ServiceBusTransportType> transportType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusQueueMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.brokeredMessageProperties = defaults.brokeredMessageProperties;
    	      this.customMessageProperties = defaults.customMessageProperties;
    	      this.message = defaults.message;
    	      this.namespace = defaults.namespace;
    	      this.queueName = defaults.queueName;
    	      this.transportType = defaults.transportType;
        }

        public Builder authentication(@Nullable Input<ServiceBusAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder authentication(@Nullable ServiceBusAuthenticationArgs authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder brokeredMessageProperties(@Nullable Input<ServiceBusBrokeredMessagePropertiesArgs> brokeredMessageProperties) {
            this.brokeredMessageProperties = brokeredMessageProperties;
            return this;
        }

        public Builder brokeredMessageProperties(@Nullable ServiceBusBrokeredMessagePropertiesArgs brokeredMessageProperties) {
            this.brokeredMessageProperties = Input.ofNullable(brokeredMessageProperties);
            return this;
        }

        public Builder customMessageProperties(@Nullable Input<Map<String,String>> customMessageProperties) {
            this.customMessageProperties = customMessageProperties;
            return this;
        }

        public Builder customMessageProperties(@Nullable Map<String,String> customMessageProperties) {
            this.customMessageProperties = Input.ofNullable(customMessageProperties);
            return this;
        }

        public Builder message(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder namespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder queueName(@Nullable Input<String> queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder queueName(@Nullable String queueName) {
            this.queueName = Input.ofNullable(queueName);
            return this;
        }

        public Builder transportType(@Nullable Input<ServiceBusTransportType> transportType) {
            this.transportType = transportType;
            return this;
        }

        public Builder transportType(@Nullable ServiceBusTransportType transportType) {
            this.transportType = Input.ofNullable(transportType);
            return this;
        }
        public ServiceBusQueueMessageArgs build() {
            return new ServiceBusQueueMessageArgs(authentication, brokeredMessageProperties, customMessageProperties, message, namespace, queueName, transportType);
        }
    }
}

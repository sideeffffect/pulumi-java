// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppHybridConnectionResult {
    /**
     * The hostname of the endpoint.
     * 
     */
    private final @Nullable String hostname;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * The port of the endpoint.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The ARM URI to the Service Bus relay.
     * 
     */
    private final @Nullable String relayArmUri;
    /**
     * The name of the Service Bus relay.
     * 
     */
    private final @Nullable String relayName;
    /**
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    private final @Nullable String sendKeyName;
    /**
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    private final @Nullable String sendKeyValue;
    /**
     * The name of the Service Bus namespace.
     * 
     */
    private final @Nullable String serviceBusNamespace;
    /**
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    private final @Nullable String serviceBusSuffix;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"hostname","id","kind","name","port","relayArmUri","relayName","sendKeyName","sendKeyValue","serviceBusNamespace","serviceBusSuffix","type"})
    private GetWebAppHybridConnectionResult(
        @Nullable String hostname,
        String id,
        @Nullable String kind,
        String name,
        @Nullable Integer port,
        @Nullable String relayArmUri,
        @Nullable String relayName,
        @Nullable String sendKeyName,
        @Nullable String sendKeyValue,
        @Nullable String serviceBusNamespace,
        @Nullable String serviceBusSuffix,
        String type) {
        this.hostname = hostname;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.port = port;
        this.relayArmUri = relayArmUri;
        this.relayName = relayName;
        this.sendKeyName = sendKeyName;
        this.sendKeyValue = sendKeyValue;
        this.serviceBusNamespace = serviceBusNamespace;
        this.serviceBusSuffix = serviceBusSuffix;
        this.type = type;
    }

    /**
     * The hostname of the endpoint.
     * 
    */
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The port of the endpoint.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The ARM URI to the Service Bus relay.
     * 
    */
    public Optional<String> getRelayArmUri() {
        return Optional.ofNullable(this.relayArmUri);
    }
    /**
     * The name of the Service Bus relay.
     * 
    */
    public Optional<String> getRelayName() {
        return Optional.ofNullable(this.relayName);
    }
    /**
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
    */
    public Optional<String> getSendKeyName() {
        return Optional.ofNullable(this.sendKeyName);
    }
    /**
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
    */
    public Optional<String> getSendKeyValue() {
        return Optional.ofNullable(this.sendKeyValue);
    }
    /**
     * The name of the Service Bus namespace.
     * 
    */
    public Optional<String> getServiceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }
    /**
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
    */
    public Optional<String> getServiceBusSuffix() {
        return Optional.ofNullable(this.serviceBusSuffix);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppHybridConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable Integer port;
        private @Nullable String relayArmUri;
        private @Nullable String relayName;
        private @Nullable String sendKeyName;
        private @Nullable String sendKeyValue;
        private @Nullable String serviceBusNamespace;
        private @Nullable String serviceBusSuffix;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppHybridConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.relayArmUri = defaults.relayArmUri;
    	      this.relayName = defaults.relayName;
    	      this.sendKeyName = defaults.sendKeyName;
    	      this.sendKeyValue = defaults.sendKeyValue;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.serviceBusSuffix = defaults.serviceBusSuffix;
    	      this.type = defaults.type;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setRelayArmUri(@Nullable String relayArmUri) {
            this.relayArmUri = relayArmUri;
            return this;
        }

        public Builder setRelayName(@Nullable String relayName) {
            this.relayName = relayName;
            return this;
        }

        public Builder setSendKeyName(@Nullable String sendKeyName) {
            this.sendKeyName = sendKeyName;
            return this;
        }

        public Builder setSendKeyValue(@Nullable String sendKeyValue) {
            this.sendKeyValue = sendKeyValue;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder setServiceBusSuffix(@Nullable String serviceBusSuffix) {
            this.serviceBusSuffix = serviceBusSuffix;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppHybridConnectionResult build() {
            return new GetWebAppHybridConnectionResult(hostname, id, kind, name, port, relayArmUri, relayName, sendKeyName, sendKeyValue, serviceBusNamespace, serviceBusSuffix, type);
        }
    }
}

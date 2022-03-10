// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.ServiceAttachmentConnectionPreference;
import io.pulumi.googlenative.compute_beta.inputs.ServiceAttachmentConsumerProjectLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentArgs Empty = new ServiceAttachmentArgs();

    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    @InputImport(name="connectionPreference")
      private final @Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference;

    public Input<ServiceAttachmentConnectionPreference> getConnectionPreference() {
        return this.connectionPreference == null ? Input.empty() : this.connectionPreference;
    }

    /**
     * Projects that are allowed to connect to this service attachment.
     * 
     */
    @InputImport(name="consumerAcceptLists")
      private final @Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;

    public Input<List<ServiceAttachmentConsumerProjectLimitArgs>> getConsumerAcceptLists() {
        return this.consumerAcceptLists == null ? Input.empty() : this.consumerAcceptLists;
    }

    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    @InputImport(name="consumerRejectLists")
      private final @Nullable Input<List<String>> consumerRejectLists;

    public Input<List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists == null ? Input.empty() : this.consumerRejectLists;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
     * 
     */
    @InputImport(name="domainNames")
      private final @Nullable Input<List<String>> domainNames;

    public Input<List<String>> getDomainNames() {
        return this.domainNames == null ? Input.empty() : this.domainNames;
    }

    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    @InputImport(name="enableProxyProtocol")
      private final @Nullable Input<Boolean> enableProxyProtocol;

    public Input<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol == null ? Input.empty() : this.enableProxyProtocol;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    @InputImport(name="natSubnets")
      private final @Nullable Input<List<String>> natSubnets;

    public Input<List<String>> getNatSubnets() {
        return this.natSubnets == null ? Input.empty() : this.natSubnets;
    }

    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    @InputImport(name="producerForwardingRule")
      private final @Nullable Input<String> producerForwardingRule;

    public Input<String> getProducerForwardingRule() {
        return this.producerForwardingRule == null ? Input.empty() : this.producerForwardingRule;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    @InputImport(name="targetService")
      private final @Nullable Input<String> targetService;

    public Input<String> getTargetService() {
        return this.targetService == null ? Input.empty() : this.targetService;
    }

    public ServiceAttachmentArgs(
        @Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference,
        @Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists,
        @Nullable Input<List<String>> consumerRejectLists,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> domainNames,
        @Nullable Input<Boolean> enableProxyProtocol,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> natSubnets,
        @Nullable Input<String> producerForwardingRule,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> targetService) {
        this.connectionPreference = connectionPreference;
        this.consumerAcceptLists = consumerAcceptLists;
        this.consumerRejectLists = consumerRejectLists;
        this.description = description;
        this.domainNames = domainNames;
        this.enableProxyProtocol = enableProxyProtocol;
        this.name = name;
        this.natSubnets = natSubnets;
        this.producerForwardingRule = producerForwardingRule;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.targetService = targetService;
    }

    private ServiceAttachmentArgs() {
        this.connectionPreference = Input.empty();
        this.consumerAcceptLists = Input.empty();
        this.consumerRejectLists = Input.empty();
        this.description = Input.empty();
        this.domainNames = Input.empty();
        this.enableProxyProtocol = Input.empty();
        this.name = Input.empty();
        this.natSubnets = Input.empty();
        this.producerForwardingRule = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.targetService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference;
        private @Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;
        private @Nullable Input<List<String>> consumerRejectLists;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> domainNames;
        private @Nullable Input<Boolean> enableProxyProtocol;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> natSubnets;
        private @Nullable Input<String> producerForwardingRule;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> targetService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.consumerAcceptLists = defaults.consumerAcceptLists;
    	      this.consumerRejectLists = defaults.consumerRejectLists;
    	      this.description = defaults.description;
    	      this.domainNames = defaults.domainNames;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.name = defaults.name;
    	      this.natSubnets = defaults.natSubnets;
    	      this.producerForwardingRule = defaults.producerForwardingRule;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.targetService = defaults.targetService;
        }

        public Builder connectionPreference(@Nullable Input<ServiceAttachmentConnectionPreference> connectionPreference) {
            this.connectionPreference = connectionPreference;
            return this;
        }

        public Builder connectionPreference(@Nullable ServiceAttachmentConnectionPreference connectionPreference) {
            this.connectionPreference = Input.ofNullable(connectionPreference);
            return this;
        }

        public Builder consumerAcceptLists(@Nullable Input<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists) {
            this.consumerAcceptLists = consumerAcceptLists;
            return this;
        }

        public Builder consumerAcceptLists(@Nullable List<ServiceAttachmentConsumerProjectLimitArgs> consumerAcceptLists) {
            this.consumerAcceptLists = Input.ofNullable(consumerAcceptLists);
            return this;
        }

        public Builder consumerRejectLists(@Nullable Input<List<String>> consumerRejectLists) {
            this.consumerRejectLists = consumerRejectLists;
            return this;
        }

        public Builder consumerRejectLists(@Nullable List<String> consumerRejectLists) {
            this.consumerRejectLists = Input.ofNullable(consumerRejectLists);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder domainNames(@Nullable Input<List<String>> domainNames) {
            this.domainNames = domainNames;
            return this;
        }

        public Builder domainNames(@Nullable List<String> domainNames) {
            this.domainNames = Input.ofNullable(domainNames);
            return this;
        }

        public Builder enableProxyProtocol(@Nullable Input<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        public Builder enableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Input.ofNullable(enableProxyProtocol);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder natSubnets(@Nullable Input<List<String>> natSubnets) {
            this.natSubnets = natSubnets;
            return this;
        }

        public Builder natSubnets(@Nullable List<String> natSubnets) {
            this.natSubnets = Input.ofNullable(natSubnets);
            return this;
        }

        public Builder producerForwardingRule(@Nullable Input<String> producerForwardingRule) {
            this.producerForwardingRule = producerForwardingRule;
            return this;
        }

        public Builder producerForwardingRule(@Nullable String producerForwardingRule) {
            this.producerForwardingRule = Input.ofNullable(producerForwardingRule);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder targetService(@Nullable Input<String> targetService) {
            this.targetService = targetService;
            return this;
        }

        public Builder targetService(@Nullable String targetService) {
            this.targetService = Input.ofNullable(targetService);
            return this;
        }
        public ServiceAttachmentArgs build() {
            return new ServiceAttachmentArgs(connectionPreference, consumerAcceptLists, consumerRejectLists, description, domainNames, enableProxyProtocol, name, natSubnets, producerForwardingRule, project, region, requestId, targetService);
        }
    }
}

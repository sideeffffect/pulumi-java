// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetForwardingRuleResult {
    private final Boolean allPorts;
    private final Boolean allowGlobalAccess;
    private final String backendService;
    private final String creationTimestamp;
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String ipAddress;
    private final String ipProtocol;
    private final Boolean isMirroringCollector;
    private final String labelFingerprint;
    private final Map<String,String> labels;
    private final String loadBalancingScheme;
    private final String name;
    private final String network;
    private final String networkTier;
    private final String portRange;
    private final List<String> ports;
    private final @Nullable String project;
    private final @Nullable String region;
    private final String selfLink;
    private final String serviceLabel;
    private final String serviceName;
    private final String subnetwork;
    private final String target;

    @OutputCustomType.Constructor({"allPorts","allowGlobalAccess","backendService","creationTimestamp","description","id","ipAddress","ipProtocol","isMirroringCollector","labelFingerprint","labels","loadBalancingScheme","name","network","networkTier","portRange","ports","project","region","selfLink","serviceLabel","serviceName","subnetwork","target"})
    private GetForwardingRuleResult(
        Boolean allPorts,
        Boolean allowGlobalAccess,
        String backendService,
        String creationTimestamp,
        String description,
        String id,
        String ipAddress,
        String ipProtocol,
        Boolean isMirroringCollector,
        String labelFingerprint,
        Map<String,String> labels,
        String loadBalancingScheme,
        String name,
        String network,
        String networkTier,
        String portRange,
        List<String> ports,
        @Nullable String project,
        @Nullable String region,
        String selfLink,
        String serviceLabel,
        String serviceName,
        String subnetwork,
        String target) {
        this.allPorts = allPorts;
        this.allowGlobalAccess = allowGlobalAccess;
        this.backendService = backendService;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.id = id;
        this.ipAddress = ipAddress;
        this.ipProtocol = ipProtocol;
        this.isMirroringCollector = isMirroringCollector;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.loadBalancingScheme = loadBalancingScheme;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.portRange = portRange;
        this.ports = ports;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.serviceLabel = serviceLabel;
        this.serviceName = serviceName;
        this.subnetwork = subnetwork;
        this.target = target;
    }

    public Boolean getAllPorts() {
        return this.allPorts;
    }
    public Boolean getAllowGlobalAccess() {
        return this.allowGlobalAccess;
    }
    public String getBackendService() {
        return this.backendService;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }
    public Boolean getIsMirroringCollector() {
        return this.isMirroringCollector;
    }
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getLoadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public String getNetworkTier() {
        return this.networkTier;
    }
    public String getPortRange() {
        return this.portRange;
    }
    public List<String> getPorts() {
        return this.ports;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getServiceLabel() {
        return this.serviceLabel;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }
    public String getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetForwardingRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allPorts;
        private Boolean allowGlobalAccess;
        private String backendService;
        private String creationTimestamp;
        private String description;
        private String id;
        private String ipAddress;
        private String ipProtocol;
        private Boolean isMirroringCollector;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String loadBalancingScheme;
        private String name;
        private String network;
        private String networkTier;
        private String portRange;
        private List<String> ports;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;
        private String serviceLabel;
        private String serviceName;
        private String subnetwork;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(GetForwardingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allPorts = defaults.allPorts;
    	      this.allowGlobalAccess = defaults.allowGlobalAccess;
    	      this.backendService = defaults.backendService;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.isMirroringCollector = defaults.isMirroringCollector;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.portRange = defaults.portRange;
    	      this.ports = defaults.ports;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.serviceName = defaults.serviceName;
    	      this.subnetwork = defaults.subnetwork;
    	      this.target = defaults.target;
        }

        public Builder setAllPorts(Boolean allPorts) {
            this.allPorts = Objects.requireNonNull(allPorts);
            return this;
        }

        public Builder setAllowGlobalAccess(Boolean allowGlobalAccess) {
            this.allowGlobalAccess = Objects.requireNonNull(allowGlobalAccess);
            return this;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setIpProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }

        public Builder setIsMirroringCollector(Boolean isMirroringCollector) {
            this.isMirroringCollector = Objects.requireNonNull(isMirroringCollector);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLoadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPortRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }

        public Builder setPorts(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServiceLabel(String serviceLabel) {
            this.serviceLabel = Objects.requireNonNull(serviceLabel);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public GetForwardingRuleResult build() {
            return new GetForwardingRuleResult(allPorts, allowGlobalAccess, backendService, creationTimestamp, description, id, ipAddress, ipProtocol, isMirroringCollector, labelFingerprint, labels, loadBalancingScheme, name, network, networkTier, portRange, ports, project, region, selfLink, serviceLabel, serviceName, subnetwork, target);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.baremetalsolution.v2.outputs.IntakeVlanAttachmentResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NetworkConfigResponse {
    /**
     * @return Interconnect bandwidth. Set only when type is CLIENT.
     * 
     */
    private final String bandwidth;
    /**
     * @return CIDR range of the network.
     * 
     */
    private final String cidr;
    /**
     * @return The GCP service of the network. Available gcp_service are in https://cloud.google.com/bare-metal/docs/bms-planning.
     * 
     */
    private final String gcpService;
    /**
     * @return The JumboFramesEnabled option for customer to set.
     * 
     */
    private final Boolean jumboFramesEnabled;
    /**
     * @return The name of the network config.
     * 
     */
    private final String name;
    /**
     * @return Service CIDR, if any.
     * 
     */
    private final String serviceCidr;
    /**
     * @return The type of this network, either Client or Private.
     * 
     */
    private final String type;
    /**
     * @return User note field, it can be used by customers to add additional information for the BMS Ops team .
     * 
     */
    private final String userNote;
    /**
     * @return List of VLAN attachments. As of now there are always 2 attachments, but it is going to change in the future (multi vlan).
     * 
     */
    private final List<IntakeVlanAttachmentResponse> vlanAttachments;
    /**
     * @return Whether the VLAN attachment pair is located in the same project.
     * 
     */
    private final Boolean vlanSameProject;

    @CustomType.Constructor
    private NetworkConfigResponse(
        @CustomType.Parameter("bandwidth") String bandwidth,
        @CustomType.Parameter("cidr") String cidr,
        @CustomType.Parameter("gcpService") String gcpService,
        @CustomType.Parameter("jumboFramesEnabled") Boolean jumboFramesEnabled,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serviceCidr") String serviceCidr,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userNote") String userNote,
        @CustomType.Parameter("vlanAttachments") List<IntakeVlanAttachmentResponse> vlanAttachments,
        @CustomType.Parameter("vlanSameProject") Boolean vlanSameProject) {
        this.bandwidth = bandwidth;
        this.cidr = cidr;
        this.gcpService = gcpService;
        this.jumboFramesEnabled = jumboFramesEnabled;
        this.name = name;
        this.serviceCidr = serviceCidr;
        this.type = type;
        this.userNote = userNote;
        this.vlanAttachments = vlanAttachments;
        this.vlanSameProject = vlanSameProject;
    }

    /**
     * @return Interconnect bandwidth. Set only when type is CLIENT.
     * 
     */
    public String bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return CIDR range of the network.
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return The GCP service of the network. Available gcp_service are in https://cloud.google.com/bare-metal/docs/bms-planning.
     * 
     */
    public String gcpService() {
        return this.gcpService;
    }
    /**
     * @return The JumboFramesEnabled option for customer to set.
     * 
     */
    public Boolean jumboFramesEnabled() {
        return this.jumboFramesEnabled;
    }
    /**
     * @return The name of the network config.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Service CIDR, if any.
     * 
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }
    /**
     * @return The type of this network, either Client or Private.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return User note field, it can be used by customers to add additional information for the BMS Ops team .
     * 
     */
    public String userNote() {
        return this.userNote;
    }
    /**
     * @return List of VLAN attachments. As of now there are always 2 attachments, but it is going to change in the future (multi vlan).
     * 
     */
    public List<IntakeVlanAttachmentResponse> vlanAttachments() {
        return this.vlanAttachments;
    }
    /**
     * @return Whether the VLAN attachment pair is located in the same project.
     * 
     */
    public Boolean vlanSameProject() {
        return this.vlanSameProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bandwidth;
        private String cidr;
        private String gcpService;
        private Boolean jumboFramesEnabled;
        private String name;
        private String serviceCidr;
        private String type;
        private String userNote;
        private List<IntakeVlanAttachmentResponse> vlanAttachments;
        private Boolean vlanSameProject;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.cidr = defaults.cidr;
    	      this.gcpService = defaults.gcpService;
    	      this.jumboFramesEnabled = defaults.jumboFramesEnabled;
    	      this.name = defaults.name;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.type = defaults.type;
    	      this.userNote = defaults.userNote;
    	      this.vlanAttachments = defaults.vlanAttachments;
    	      this.vlanSameProject = defaults.vlanSameProject;
        }

        public Builder bandwidth(String bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public Builder gcpService(String gcpService) {
            this.gcpService = Objects.requireNonNull(gcpService);
            return this;
        }
        public Builder jumboFramesEnabled(Boolean jumboFramesEnabled) {
            this.jumboFramesEnabled = Objects.requireNonNull(jumboFramesEnabled);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serviceCidr(String serviceCidr) {
            this.serviceCidr = Objects.requireNonNull(serviceCidr);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userNote(String userNote) {
            this.userNote = Objects.requireNonNull(userNote);
            return this;
        }
        public Builder vlanAttachments(List<IntakeVlanAttachmentResponse> vlanAttachments) {
            this.vlanAttachments = Objects.requireNonNull(vlanAttachments);
            return this;
        }
        public Builder vlanAttachments(IntakeVlanAttachmentResponse... vlanAttachments) {
            return vlanAttachments(List.of(vlanAttachments));
        }
        public Builder vlanSameProject(Boolean vlanSameProject) {
            this.vlanSameProject = Objects.requireNonNull(vlanSameProject);
            return this;
        }        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(bandwidth, cidr, gcpService, jumboFramesEnabled, name, serviceCidr, type, userNote, vlanAttachments, vlanSameProject);
        }
    }
}

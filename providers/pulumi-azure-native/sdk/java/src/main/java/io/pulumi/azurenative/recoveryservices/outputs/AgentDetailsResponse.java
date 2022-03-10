// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AgentDiskDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AgentDetailsResponse {
    /**
     * The Id of the agent running on the server.
     * 
     */
    private final String agentId;
    /**
     * The machine BIOS Id.
     * 
     */
    private final String biosId;
    /**
     * The details of agent disks.
     * 
     */
    private final List<AgentDiskDetailsResponse> disks;
    /**
     * The machine FQDN.
     * 
     */
    private final String fqdn;
    /**
     * The Id of the machine to which the agent is registered.
     * 
     */
    private final String machineId;

    @OutputCustomType.Constructor
    private AgentDetailsResponse(
        @OutputCustomType.Parameter("agentId") String agentId,
        @OutputCustomType.Parameter("biosId") String biosId,
        @OutputCustomType.Parameter("disks") List<AgentDiskDetailsResponse> disks,
        @OutputCustomType.Parameter("fqdn") String fqdn,
        @OutputCustomType.Parameter("machineId") String machineId) {
        this.agentId = agentId;
        this.biosId = biosId;
        this.disks = disks;
        this.fqdn = fqdn;
        this.machineId = machineId;
    }

    /**
     * The Id of the agent running on the server.
     * 
    */
    public String getAgentId() {
        return this.agentId;
    }
    /**
     * The machine BIOS Id.
     * 
    */
    public String getBiosId() {
        return this.biosId;
    }
    /**
     * The details of agent disks.
     * 
    */
    public List<AgentDiskDetailsResponse> getDisks() {
        return this.disks;
    }
    /**
     * The machine FQDN.
     * 
    */
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * The Id of the machine to which the agent is registered.
     * 
    */
    public String getMachineId() {
        return this.machineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String biosId;
        private List<AgentDiskDetailsResponse> disks;
        private String fqdn;
        private String machineId;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.biosId = defaults.biosId;
    	      this.disks = defaults.disks;
    	      this.fqdn = defaults.fqdn;
    	      this.machineId = defaults.machineId;
        }

        public Builder agentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder biosId(String biosId) {
            this.biosId = Objects.requireNonNull(biosId);
            return this;
        }

        public Builder disks(List<AgentDiskDetailsResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder machineId(String machineId) {
            this.machineId = Objects.requireNonNull(machineId);
            return this;
        }
        public AgentDetailsResponse build() {
            return new AgentDetailsResponse(agentId, biosId, disks, fqdn, machineId);
        }
    }
}

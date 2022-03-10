// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContactFlowModuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContactFlowModuleArgs Empty = new GetContactFlowModuleArgs();

    /**
     * Returns information on a specific Contact Flow Module by contact flow module id
     * 
     */
    @InputImport(name="contactFlowModuleId")
      private final @Nullable String contactFlowModuleId;

    public Optional<String> getContactFlowModuleId() {
        return this.contactFlowModuleId == null ? Optional.empty() : Optional.ofNullable(this.contactFlowModuleId);
    }

    /**
     * Reference to the hosting Amazon Connect Instance
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * Returns information on a specific Contact Flow Module by name
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the Contact Flow Module.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetContactFlowModuleArgs(
        @Nullable String contactFlowModuleId,
        String instanceId,
        @Nullable String name,
        @Nullable Map<String,String> tags) {
        this.contactFlowModuleId = contactFlowModuleId;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private GetContactFlowModuleArgs() {
        this.contactFlowModuleId = null;
        this.instanceId = null;
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactFlowModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contactFlowModuleId;
        private String instanceId;
        private @Nullable String name;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactFlowModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowModuleId = defaults.contactFlowModuleId;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder contactFlowModuleId(@Nullable String contactFlowModuleId) {
            this.contactFlowModuleId = contactFlowModuleId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetContactFlowModuleArgs build() {
            return new GetContactFlowModuleArgs(contactFlowModuleId, instanceId, name, tags);
        }
    }
}

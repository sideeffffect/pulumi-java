// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupNamespaceState extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupNamespaceState Empty = new RuleGroupNamespaceState();

    /**
     * the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
     * 
     */
    @InputImport(name="data")
      private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    /**
     * The name of the rule group namespace
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The id of the prometheus workspace the rule group namespace should be linked to
     * 
     */
    @InputImport(name="workspaceId")
      private final @Nullable Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId == null ? Input.empty() : this.workspaceId;
    }

    public RuleGroupNamespaceState(
        @Nullable Input<String> data,
        @Nullable Input<String> name,
        @Nullable Input<String> workspaceId) {
        this.data = data;
        this.name = name;
        this.workspaceId = workspaceId;
    }

    private RuleGroupNamespaceState() {
        this.data = Input.empty();
        this.name = Input.empty();
        this.workspaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> data;
        private @Nullable Input<String> name;
        private @Nullable Input<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupNamespaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.name = defaults.name;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder data(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder data(@Nullable String data) {
            this.data = Input.ofNullable(data);
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

        public Builder workspaceId(@Nullable Input<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = Input.ofNullable(workspaceId);
            return this;
        }
        public RuleGroupNamespaceState build() {
            return new RuleGroupNamespaceState(data, name, workspaceId);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRuleResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * specifies the list of one or more permissions to include in the custom role, such as - `iam.roles.get`
     * 
     */
    private final List<String> includedPermissions;
    private final String name;
    /**
     * indicates the stage of a role in the launch lifecycle, such as `GA`, `BETA` or `ALPHA`.
     * 
     */
    private final String stage;
    /**
     * is a friendly title for the role, such as "Role Viewer"
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GetRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("includedPermissions") List<String> includedPermissions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("stage") String stage,
        @CustomType.Parameter("title") String title) {
        this.id = id;
        this.includedPermissions = includedPermissions;
        this.name = name;
        this.stage = stage;
        this.title = title;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * specifies the list of one or more permissions to include in the custom role, such as - `iam.roles.get`
     * 
    */
    public List<String> includedPermissions() {
        return this.includedPermissions;
    }
    public String name() {
        return this.name;
    }
    /**
     * indicates the stage of a role in the launch lifecycle, such as `GA`, `BETA` or `ALPHA`.
     * 
    */
    public String stage() {
        return this.stage;
    }
    /**
     * is a friendly title for the role, such as "Role Viewer"
     * 
    */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> includedPermissions;
        private String name;
        private String stage;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.includedPermissions = defaults.includedPermissions;
    	      this.name = defaults.name;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder includedPermissions(List<String> includedPermissions) {
            this.includedPermissions = Objects.requireNonNull(includedPermissions);
            return this;
        }
        public Builder includedPermissions(String... includedPermissions) {
            return includedPermissions(List.of(includedPermissions));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder stage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GetRuleResult build() {
            return new GetRuleResult(id, includedPermissions, name, stage, title);
        }
    }
}

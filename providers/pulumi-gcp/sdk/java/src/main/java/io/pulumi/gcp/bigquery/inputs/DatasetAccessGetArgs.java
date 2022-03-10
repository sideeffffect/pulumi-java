// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.DatasetAccessViewGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetAccessGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetAccessGetArgs Empty = new DatasetAccessGetArgs();

    /**
     * A domain to grant access to. Any users signed in with the
     * domain specified will be granted the specified access
     * 
     */
    @InputImport(name="domain")
      private final @Nullable Input<String> domain;

    public Input<String> getDomain() {
        return this.domain == null ? Input.empty() : this.domain;
    }

    /**
     * An email address of a Google Group to grant access to.
     * 
     */
    @InputImport(name="groupByEmail")
      private final @Nullable Input<String> groupByEmail;

    public Input<String> getGroupByEmail() {
        return this.groupByEmail == null ? Input.empty() : this.groupByEmail;
    }

    /**
     * Describes the rights granted to the user specified by the other
     * member of the access object. Basic, predefined, and custom roles
     * are supported. Predefined roles that have equivalent basic roles
     * are swapped by the API to their basic counterparts. See
     * [official docs](https://cloud.google.com/bigquery/docs/access-control).
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * A special group to grant access to. Possible values include:
     * 
     */
    @InputImport(name="specialGroup")
      private final @Nullable Input<String> specialGroup;

    public Input<String> getSpecialGroup() {
        return this.specialGroup == null ? Input.empty() : this.specialGroup;
    }

    /**
     * An email address of a user to grant access to. For example:
     * fred@example.com
     * 
     */
    @InputImport(name="userByEmail")
      private final @Nullable Input<String> userByEmail;

    public Input<String> getUserByEmail() {
        return this.userByEmail == null ? Input.empty() : this.userByEmail;
    }

    /**
     * A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * 
     */
    @InputImport(name="view")
      private final @Nullable Input<DatasetAccessViewGetArgs> view;

    public Input<DatasetAccessViewGetArgs> getView() {
        return this.view == null ? Input.empty() : this.view;
    }

    public DatasetAccessGetArgs(
        @Nullable Input<String> domain,
        @Nullable Input<String> groupByEmail,
        @Nullable Input<String> role,
        @Nullable Input<String> specialGroup,
        @Nullable Input<String> userByEmail,
        @Nullable Input<DatasetAccessViewGetArgs> view) {
        this.domain = domain;
        this.groupByEmail = groupByEmail;
        this.role = role;
        this.specialGroup = specialGroup;
        this.userByEmail = userByEmail;
        this.view = view;
    }

    private DatasetAccessGetArgs() {
        this.domain = Input.empty();
        this.groupByEmail = Input.empty();
        this.role = Input.empty();
        this.specialGroup = Input.empty();
        this.userByEmail = Input.empty();
        this.view = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domain;
        private @Nullable Input<String> groupByEmail;
        private @Nullable Input<String> role;
        private @Nullable Input<String> specialGroup;
        private @Nullable Input<String> userByEmail;
        private @Nullable Input<DatasetAccessViewGetArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.groupByEmail = defaults.groupByEmail;
    	      this.role = defaults.role;
    	      this.specialGroup = defaults.specialGroup;
    	      this.userByEmail = defaults.userByEmail;
    	      this.view = defaults.view;
        }

        public Builder domain(@Nullable Input<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder domain(@Nullable String domain) {
            this.domain = Input.ofNullable(domain);
            return this;
        }

        public Builder groupByEmail(@Nullable Input<String> groupByEmail) {
            this.groupByEmail = groupByEmail;
            return this;
        }

        public Builder groupByEmail(@Nullable String groupByEmail) {
            this.groupByEmail = Input.ofNullable(groupByEmail);
            return this;
        }

        public Builder role(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder specialGroup(@Nullable Input<String> specialGroup) {
            this.specialGroup = specialGroup;
            return this;
        }

        public Builder specialGroup(@Nullable String specialGroup) {
            this.specialGroup = Input.ofNullable(specialGroup);
            return this;
        }

        public Builder userByEmail(@Nullable Input<String> userByEmail) {
            this.userByEmail = userByEmail;
            return this;
        }

        public Builder userByEmail(@Nullable String userByEmail) {
            this.userByEmail = Input.ofNullable(userByEmail);
            return this;
        }

        public Builder view(@Nullable Input<DatasetAccessViewGetArgs> view) {
            this.view = view;
            return this;
        }

        public Builder view(@Nullable DatasetAccessViewGetArgs view) {
            this.view = Input.ofNullable(view);
            return this;
        }
        public DatasetAccessGetArgs build() {
            return new DatasetAccessGetArgs(domain, groupByEmail, role, specialGroup, userByEmail, view);
        }
    }
}

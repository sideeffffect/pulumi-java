// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountExclusionArgs Empty = new BillingAccountExclusionArgs();

    @InputImport(name="billingAccountId", required=true)
      private final Input<String> billingAccountId;

    public Input<String> getBillingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. A description of this exclusion.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)
     * 
     */
    @InputImport(name="filter", required=true)
      private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BillingAccountExclusionArgs(
        Input<String> billingAccountId,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        Input<String> filter,
        @Nullable Input<String> name) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = name;
    }

    private BillingAccountExclusionArgs() {
        this.billingAccountId = Input.empty();
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.filter = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> billingAccountId;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private Input<String> filter;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder billingAccountId(Input<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }

        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Input.of(Objects.requireNonNull(billingAccountId));
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

        public Builder disabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder filter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
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
        public BillingAccountExclusionArgs build() {
            return new BillingAccountExclusionArgs(billingAccountId, description, disabled, filter, name);
        }
    }
}

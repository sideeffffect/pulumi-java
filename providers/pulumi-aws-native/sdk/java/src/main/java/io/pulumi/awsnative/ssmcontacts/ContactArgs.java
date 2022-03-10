// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts;

import io.pulumi.awsnative.ssmcontacts.enums.ContactType;
import io.pulumi.awsnative.ssmcontacts.inputs.ContactStageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * Alias of the contact. String value with 20 to 256 characters. Only alphabetical, numeric characters, dash, or underscore allowed.
     * 
     */
    @InputImport(name="alias", required=true)
      private final Input<String> alias;

    public Input<String> getAlias() {
        return this.alias;
    }

    /**
     * Name of the contact. String value with 3 to 256 characters. Only alphabetical, space, numeric characters, dash, or underscore allowed.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The stages that an escalation plan or engagement plan engages contacts and contact methods in.
     * 
     */
    @InputImport(name="plan", required=true)
      private final Input<List<ContactStageArgs>> plan;

    public Input<List<ContactStageArgs>> getPlan() {
        return this.plan;
    }

    /**
     * Contact type, which specify type of contact. Currently supported values: “PERSONAL”, “SHARED”, “OTHER“.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<ContactType> type;

    public Input<ContactType> getType() {
        return this.type;
    }

    public ContactArgs(
        Input<String> alias,
        Input<String> displayName,
        Input<List<ContactStageArgs>> plan,
        Input<ContactType> type) {
        this.alias = Objects.requireNonNull(alias, "expected parameter 'alias' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.plan = Objects.requireNonNull(plan, "expected parameter 'plan' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ContactArgs() {
        this.alias = Input.empty();
        this.displayName = Input.empty();
        this.plan = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> alias;
        private Input<String> displayName;
        private Input<List<ContactStageArgs>> plan;
        private Input<ContactType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.displayName = defaults.displayName;
    	      this.plan = defaults.plan;
    	      this.type = defaults.type;
        }

        public Builder alias(Input<String> alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }

        public Builder alias(String alias) {
            this.alias = Input.of(Objects.requireNonNull(alias));
            return this;
        }

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder plan(Input<List<ContactStageArgs>> plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }

        public Builder plan(List<ContactStageArgs> plan) {
            this.plan = Input.of(Objects.requireNonNull(plan));
            return this;
        }

        public Builder type(Input<ContactType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(ContactType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ContactArgs build() {
            return new ContactArgs(alias, displayName, plan, type);
        }
    }
}

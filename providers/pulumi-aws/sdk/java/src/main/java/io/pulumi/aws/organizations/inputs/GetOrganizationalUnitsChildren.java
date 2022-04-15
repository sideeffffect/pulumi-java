// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationalUnitsChildren extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationalUnitsChildren Empty = new GetOrganizationalUnitsChildren();

    /**
     * ARN of the organizational unit
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    /**
     * Parent identifier of the organizational units.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Name of the organizational unit
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public GetOrganizationalUnitsChildren(
        String arn,
        String id,
        String name) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetOrganizationalUnitsChildren() {
        this.arn = null;
        this.id = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationalUnitsChildren defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationalUnitsChildren defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetOrganizationalUnitsChildren build() {
            return new GetOrganizationalUnitsChildren(arn, id, name);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationPolicyListPolicyAllow {
    private final Boolean all;
    private final List<String> values;

    @CustomType.Constructor
    private GetOrganizationPolicyListPolicyAllow(
        @CustomType.Parameter("all") Boolean all,
        @CustomType.Parameter("values") List<String> values) {
        this.all = all;
        this.values = values;
    }

    public Boolean all() {
        return this.all;
    }
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicyAllow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean all;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyListPolicyAllow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.values = defaults.values;
        }

        public Builder all(Boolean all) {
            this.all = Objects.requireNonNull(all);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetOrganizationPolicyListPolicyAllow build() {
            return new GetOrganizationPolicyListPolicyAllow(all, values);
        }
    }
}

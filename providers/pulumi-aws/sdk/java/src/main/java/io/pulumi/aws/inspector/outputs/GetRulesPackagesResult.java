// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRulesPackagesResult {
    /**
     * A list of the AWS Inspector Rules Packages arns available in the AWS region.
     * 
     */
    private final List<String> arns;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetRulesPackagesResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("id") String id) {
        this.arns = arns;
        this.id = id;
    }

    /**
     * A list of the AWS Inspector Rules Packages arns available in the AWS region.
     * 
    */
    public List<String> arns() {
        return this.arns;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesPackagesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesPackagesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
        }

        public Builder arns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }
        public Builder arns(String... arns) {
            return arns(List.of(arns));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetRulesPackagesResult build() {
            return new GetRulesPackagesResult(arns, id);
        }
    }
}

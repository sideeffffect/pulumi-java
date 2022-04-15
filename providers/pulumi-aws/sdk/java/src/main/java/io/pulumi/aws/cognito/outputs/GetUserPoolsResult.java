// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserPoolsResult {
    /**
     * The set of cognito user pool Amazon Resource Names (ARNs).
     * 
     */
    private final List<String> arns;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The set of cognito user pool ids.
     * 
     */
    private final List<String> ids;
    private final String name;

    @CustomType.Constructor
    private GetUserPoolsResult(
        @CustomType.Parameter("arns") List<String> arns,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("name") String name) {
        this.arns = arns;
        this.id = id;
        this.ids = ids;
        this.name = name;
    }

    /**
     * The set of cognito user pool Amazon Resource Names (ARNs).
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
    /**
     * The set of cognito user pool ids.
     * 
    */
    public List<String> ids() {
        return this.ids;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String id;
        private List<String> ids;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.name = defaults.name;
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
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetUserPoolsResult build() {
            return new GetUserPoolsResult(arns, id, ids, name);
        }
    }
}

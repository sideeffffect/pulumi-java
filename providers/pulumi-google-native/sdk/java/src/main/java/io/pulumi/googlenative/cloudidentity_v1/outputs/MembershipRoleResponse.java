// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudidentity_v1.outputs.ExpiryDetailResponse;
import io.pulumi.googlenative.cloudidentity_v1.outputs.RestrictionEvaluationsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MembershipRoleResponse {
    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    private final ExpiryDetailResponse expiryDetail;
    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    private final String name;
    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    private final RestrictionEvaluationsResponse restrictionEvaluations;

    @OutputCustomType.Constructor
    private MembershipRoleResponse(
        @OutputCustomType.Parameter("expiryDetail") ExpiryDetailResponse expiryDetail,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("restrictionEvaluations") RestrictionEvaluationsResponse restrictionEvaluations) {
        this.expiryDetail = expiryDetail;
        this.name = name;
        this.restrictionEvaluations = restrictionEvaluations;
    }

    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
    */
    public ExpiryDetailResponse getExpiryDetail() {
        return this.expiryDetail;
    }
    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
    */
    public RestrictionEvaluationsResponse getRestrictionEvaluations() {
        return this.restrictionEvaluations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipRoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpiryDetailResponse expiryDetail;
        private String name;
        private RestrictionEvaluationsResponse restrictionEvaluations;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipRoleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryDetail = defaults.expiryDetail;
    	      this.name = defaults.name;
    	      this.restrictionEvaluations = defaults.restrictionEvaluations;
        }

        public Builder expiryDetail(ExpiryDetailResponse expiryDetail) {
            this.expiryDetail = Objects.requireNonNull(expiryDetail);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder restrictionEvaluations(RestrictionEvaluationsResponse restrictionEvaluations) {
            this.restrictionEvaluations = Objects.requireNonNull(restrictionEvaluations);
            return this;
        }
        public MembershipRoleResponse build() {
            return new MembershipRoleResponse(expiryDetail, name, restrictionEvaluations);
        }
    }
}

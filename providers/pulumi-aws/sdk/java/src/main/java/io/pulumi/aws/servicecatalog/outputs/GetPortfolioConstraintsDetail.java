// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPortfolioConstraintsDetail {
    /**
     * Identifier of the constraint.
     * 
     */
    private final String constraintId;
    /**
     * Description of the constraint.
     * 
     */
    private final String description;
    private final String owner;
    /**
     * Portfolio identifier.
     * 
     */
    private final String portfolioId;
    /**
     * Product identifier.
     * 
     */
    private final String productId;
    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `STACKSET`, and `TEMPLATE`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPortfolioConstraintsDetail(
        @OutputCustomType.Parameter("constraintId") String constraintId,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("owner") String owner,
        @OutputCustomType.Parameter("portfolioId") String portfolioId,
        @OutputCustomType.Parameter("productId") String productId,
        @OutputCustomType.Parameter("type") String type) {
        this.constraintId = constraintId;
        this.description = description;
        this.owner = owner;
        this.portfolioId = portfolioId;
        this.productId = productId;
        this.type = type;
    }

    /**
     * Identifier of the constraint.
     * 
    */
    public String getConstraintId() {
        return this.constraintId;
    }
    /**
     * Description of the constraint.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    public String getOwner() {
        return this.owner;
    }
    /**
     * Portfolio identifier.
     * 
    */
    public String getPortfolioId() {
        return this.portfolioId;
    }
    /**
     * Product identifier.
     * 
    */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `STACKSET`, and `TEMPLATE`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortfolioConstraintsDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String constraintId;
        private String description;
        private String owner;
        private String portfolioId;
        private String productId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPortfolioConstraintsDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraintId = defaults.constraintId;
    	      this.description = defaults.description;
    	      this.owner = defaults.owner;
    	      this.portfolioId = defaults.portfolioId;
    	      this.productId = defaults.productId;
    	      this.type = defaults.type;
        }

        public Builder constraintId(String constraintId) {
            this.constraintId = Objects.requireNonNull(constraintId);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = Objects.requireNonNull(portfolioId);
            return this;
        }

        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPortfolioConstraintsDetail build() {
            return new GetPortfolioConstraintsDetail(constraintId, description, owner, portfolioId, productId, type);
        }
    }
}

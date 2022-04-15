// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement(
        @CustomType.Parameter("byteMatchStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement,
        @CustomType.Parameter("geoMatchStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement,
        @CustomType.Parameter("ipSetReferenceStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @CustomType.Parameter("labelMatchStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement,
        @CustomType.Parameter("regexPatternSetReferenceStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @CustomType.Parameter("sizeConstraintStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @CustomType.Parameter("sqliMatchStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement,
        @CustomType.Parameter("xssMatchStatement") @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder byteMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }        public WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementNotStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor
    private WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatement(
        @OutputCustomType.Parameter("byteMatchStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement,
        @OutputCustomType.Parameter("geoMatchStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement,
        @OutputCustomType.Parameter("ipSetReferenceStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @OutputCustomType.Parameter("labelMatchStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement,
        @OutputCustomType.Parameter("regexPatternSetReferenceStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @OutputCustomType.Parameter("sizeConstraintStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @OutputCustomType.Parameter("sqliMatchStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement,
        @OutputCustomType.Parameter("xssMatchStatement") @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
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
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
    */
    public Optional<WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatement defaults) {
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

        public Builder byteMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder labelMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatement build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}

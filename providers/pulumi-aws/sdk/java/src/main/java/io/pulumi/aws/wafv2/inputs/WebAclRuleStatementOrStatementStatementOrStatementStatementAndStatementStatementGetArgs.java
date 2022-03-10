// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs(
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs() {
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs defaults) {
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

        public Builder byteMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder geoMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder labelMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder sqliMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder xssMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}

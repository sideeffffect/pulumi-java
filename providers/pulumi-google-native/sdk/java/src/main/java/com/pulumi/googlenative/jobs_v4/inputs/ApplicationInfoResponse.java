// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v4.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Application related details of a job posting.
 * 
 */
public final class ApplicationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationInfoResponse Empty = new ApplicationInfoResponse();

    /**
     * Use this field to specify email address(es) to which resumes or applications can be sent. The maximum number of allowed characters for each entry is 255.
     * 
     */
    @Import(name="emails", required=true)
    private List<String> emails;

    public List<String> emails() {
        return this.emails;
    }

    /**
     * Use this field to provide instructions, such as &#34;Mail your application to ...&#34;, that a candidate can follow to apply for the job. This field accepts and sanitizes HTML input, and also accepts bold, italic, ordered list, and unordered list markup tags. The maximum number of allowed characters is 3,000.
     * 
     */
    @Import(name="instruction", required=true)
    private String instruction;

    public String instruction() {
        return this.instruction;
    }

    /**
     * Use this URI field to direct an applicant to a website, for example to link to an online application form. The maximum number of allowed characters for each entry is 2,000.
     * 
     */
    @Import(name="uris", required=true)
    private List<String> uris;

    public List<String> uris() {
        return this.uris;
    }

    private ApplicationInfoResponse() {}

    private ApplicationInfoResponse(ApplicationInfoResponse $) {
        this.emails = $.emails;
        this.instruction = $.instruction;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationInfoResponse $;

        public Builder() {
            $ = new ApplicationInfoResponse();
        }

        public Builder(ApplicationInfoResponse defaults) {
            $ = new ApplicationInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder emails(List<String> emails) {
            $.emails = emails;
            return this;
        }

        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }

        public Builder instruction(String instruction) {
            $.instruction = instruction;
            return this;
        }

        public Builder uris(List<String> uris) {
            $.uris = uris;
            return this;
        }

        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public ApplicationInfoResponse build() {
            $.emails = Objects.requireNonNull($.emails, "expected parameter 'emails' to be non-null");
            $.instruction = Objects.requireNonNull($.instruction, "expected parameter 'instruction' to be non-null");
            $.uris = Objects.requireNonNull($.uris, "expected parameter 'uris' to be non-null");
            return $;
        }
    }

}

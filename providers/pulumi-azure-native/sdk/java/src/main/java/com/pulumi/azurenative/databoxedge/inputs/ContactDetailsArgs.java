// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Contains all the contact details of the customer.
 * 
 */
public final class ContactDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactDetailsArgs Empty = new ContactDetailsArgs();

    /**
     * The name of the company.
     * 
     */
    @Import(name="companyName", required=true)
    private Output<String> companyName;

    public Output<String> companyName() {
        return this.companyName;
    }

    /**
     * The contact person name.
     * 
     */
    @Import(name="contactPerson", required=true)
    private Output<String> contactPerson;

    public Output<String> contactPerson() {
        return this.contactPerson;
    }

    /**
     * The email list.
     * 
     */
    @Import(name="emailList", required=true)
    private Output<List<String>> emailList;

    public Output<List<String>> emailList() {
        return this.emailList;
    }

    /**
     * The phone number.
     * 
     */
    @Import(name="phone", required=true)
    private Output<String> phone;

    public Output<String> phone() {
        return this.phone;
    }

    private ContactDetailsArgs() {}

    private ContactDetailsArgs(ContactDetailsArgs $) {
        this.companyName = $.companyName;
        this.contactPerson = $.contactPerson;
        this.emailList = $.emailList;
        this.phone = $.phone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactDetailsArgs $;

        public Builder() {
            $ = new ContactDetailsArgs();
        }

        public Builder(ContactDetailsArgs defaults) {
            $ = new ContactDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder companyName(Output<String> companyName) {
            $.companyName = companyName;
            return this;
        }

        public Builder companyName(String companyName) {
            return companyName(Output.of(companyName));
        }

        public Builder contactPerson(Output<String> contactPerson) {
            $.contactPerson = contactPerson;
            return this;
        }

        public Builder contactPerson(String contactPerson) {
            return contactPerson(Output.of(contactPerson));
        }

        public Builder emailList(Output<List<String>> emailList) {
            $.emailList = emailList;
            return this;
        }

        public Builder emailList(List<String> emailList) {
            return emailList(Output.of(emailList));
        }

        public Builder emailList(String... emailList) {
            return emailList(List.of(emailList));
        }

        public Builder phone(Output<String> phone) {
            $.phone = phone;
            return this;
        }

        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        public ContactDetailsArgs build() {
            $.companyName = Objects.requireNonNull($.companyName, "expected parameter 'companyName' to be non-null");
            $.contactPerson = Objects.requireNonNull($.contactPerson, "expected parameter 'contactPerson' to be non-null");
            $.emailList = Objects.requireNonNull($.emailList, "expected parameter 'emailList' to be non-null");
            $.phone = Objects.requireNonNull($.phone, "expected parameter 'phone' to be non-null");
            return $;
        }
    }

}
